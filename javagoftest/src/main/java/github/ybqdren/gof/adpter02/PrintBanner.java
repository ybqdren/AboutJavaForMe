package github.ybqdren.gof.adpter02;

import github.ybqdren.gof.adpter.Banner;

/**
 * Created by Zhao Wen on 2021/1/25
 */

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
