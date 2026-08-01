package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC1815e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC7685e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u008a\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lua/itaysonlab/vkapi2/internal/objects/VKError;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "error_code", BuildConfig.FLAVOR, "error_msg", "method", BuildConfig.FLAVOR, "Lua/itaysonlab/vkapi2/internal/objects/VKRequestParameter;", "request_params", "captchaSid", "captchaImg", BuildConfig.FLAVOR, "captchaTs", "captchaRatio", "captchaAttempt", "redirectUri", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)Lua/itaysonlab/vkapi2/internal/objects/VKError;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VKError {
    public final int ad;
    public final String adcel;
    public final String appmetrica;
    public final Double billing;
    public final List license;
    public final String metrica;
    public final String purchase;
    public final Integer startapp;
    public final String vip;
    public final Double yandex;

    public VKError(int i, String str, String str2, List<VKRequestParameter> list, @InterfaceC7685e(name = "captcha_sid") String str3, @InterfaceC7685e(name = "captcha_img") String str4, @InterfaceC7685e(name = "captcha_ts") Double d, @InterfaceC7685e(name = "captcha_ratio") Double d2, @InterfaceC7685e(name = "captcha_attempt") Integer num, @InterfaceC7685e(name = "redirect_uri") String str5) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = list;
        this.appmetrica = str3;
        this.purchase = str4;
        this.billing = d;
        this.yandex = d2;
        this.startapp = num;
        this.adcel = str5;
    }

    public /* synthetic */ VKError(int i, String str, String str2, List list, String str3, String str4, Double d, Double d2, Integer num, String str5, int i2) {
        this(i, str, str2, list, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : d, (i2 & 128) != 0 ? null : d2, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : num, (i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : str5);
    }

    public final VKError copy(int error_code, String error_msg, String method, List<VKRequestParameter> request_params, @InterfaceC7685e(name = "captcha_sid") String captchaSid, @InterfaceC7685e(name = "captcha_img") String captchaImg, @InterfaceC7685e(name = "captcha_ts") Double captchaTs, @InterfaceC7685e(name = "captcha_ratio") Double captchaRatio, @InterfaceC7685e(name = "captcha_attempt") Integer captchaAttempt, @InterfaceC7685e(name = "redirect_uri") String redirectUri) {
        return new VKError(error_code, error_msg, method, request_params, captchaSid, captchaImg, captchaTs, captchaRatio, captchaAttempt, redirectUri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKError)) {
            return false;
        }
        VKError vKError = (VKError) obj;
        return this.ad == vKError.ad && AbstractC7890e.billing(this.vip, vKError.vip) && AbstractC7890e.billing(this.metrica, vKError.metrica) && AbstractC7890e.billing(this.license, vKError.license) && AbstractC7890e.billing(this.appmetrica, vKError.appmetrica) && AbstractC7890e.billing(this.purchase, vKError.purchase) && AbstractC7890e.billing(this.billing, vKError.billing) && AbstractC7890e.billing(this.yandex, vKError.yandex) && AbstractC7890e.billing(this.startapp, vKError.startapp) && AbstractC7890e.billing(this.adcel, vKError.adcel);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad * 31, 31, this.vip);
        String str = this.metrica;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.license;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.appmetrica;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchase;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.billing;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.yandex;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.startapp;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.adcel;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKError(error_code=");
        sb.append(this.ad);
        sb.append(", error_msg=");
        sb.append(this.vip);
        sb.append(", method=");
        sb.append(this.metrica);
        sb.append(", request_params=");
        sb.append(this.license);
        sb.append(", captchaSid=");
        sb.append(this.appmetrica);
        sb.append(", captchaImg=");
        sb.append(this.purchase);
        sb.append(", captchaTs=");
        sb.append(this.billing);
        sb.append(", captchaRatio=");
        sb.append(this.yandex);
        sb.append(", captchaAttempt=");
        sb.append(this.startapp);
        sb.append(", redirectUri=");
        return AbstractC4653e.applovin(sb, this.adcel, ')');
    }
}
