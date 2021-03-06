/*
 * Copyright 2014 Arthur Henning.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package quality_metrics;

import ij.ImagePlus;

/**
 *
 * @author Arthur Henning
 */
public class QualityMetricsOutput {

    private ImagePlus resultImage;
    private double mse;
    private double psnr;

    public QualityMetricsOutput() {
    }

    public QualityMetricsOutput(ImagePlus resultImage, double mse, double psnr) {
        this.resultImage = resultImage;
        this.mse = mse;
        this.psnr = psnr;
    }

    public ImagePlus getResultImage() {
        return resultImage;
    }

    public void setResultImage(ImagePlus resultImage) {
        this.resultImage = resultImage;
    }

    public double getMse() {
        return mse;
    }

    public void setMse(double mse) {
        this.mse = mse;
    }

    public double getPsnr() {
        return psnr;
    }

    public void setPsnr(double psnr) {
        this.psnr = psnr;
    }

    @Override
    public String toString() {
        String formatted = String.format("%100s\tMSE:%.2f\t%.2f", this.getResultImage().getTitle(), this.getMse(), this.getPsnr());
        return formatted;
    }
}
