package ua.itaysonlab.vkapi2.objects.auth;

import defpackage.InterfaceC3919e;
import defpackage.InterfaceC7685e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lua/itaysonlab/vkapi2/objects/auth/ValidatePhoneResponse;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "nextSid", "newValidationType", "nextValidationType", BuildConfig.FLAVOR, "delayBeforeNextCall", "externalId", "phone", "maskedEmail", "codeLength", "deviceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidatePhoneResponse {
    public final String ad;
    public final String appmetrica;
    public final String billing;
    public final int license;
    public final String metrica;
    public final String purchase;
    public final String startapp;
    public final String vip;
    public final int yandex;

    public ValidatePhoneResponse(@InterfaceC7685e(name = "next_sid") String str, @InterfaceC7685e(name = "validation_type") String str2, @InterfaceC7685e(name = "validation_resend") String str3, @InterfaceC7685e(name = "delay") int i, @InterfaceC7685e(name = "external_id") String str4, @InterfaceC7685e(name = "phone") String str5, @InterfaceC7685e(name = "masked_email") String str6, @InterfaceC7685e(name = "code_length") int i2, @InterfaceC7685e(name = "device_name") String str7) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = i;
        this.appmetrica = str4;
        this.purchase = str5;
        this.billing = str6;
        this.yandex = i2;
        this.startapp = str7;
    }
}
