package defpackage;

import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11639e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f23388e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23389e;

    public /* synthetic */ C11639e(String str, int i) {
        this.f23389e = i;
        this.f23388e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23389e) {
            case 0:
                return Mac.getInstance(this.f23388e);
            case 1:
                return MessageDigest.getInstance(this.f23388e);
            case 2:
                return Signature.getInstance(this.f23388e);
            case 3:
                return this.f23388e;
            case 4:
                String applovin = AbstractC4653e.applovin(new StringBuilder(), AbstractC4972e.smaato.ad.ad, '.');
                if (!AbstractC6507e.pro(this.f23388e, applovin, false)) {
                    applovin = null;
                }
                return applovin == null ? BuildConfig.FLAVOR : applovin;
            default:
                String applovin2 = AbstractC4653e.applovin(new StringBuilder(), AbstractC4972e.mopub.ad.ad, '.');
                if (!AbstractC6507e.pro(this.f23388e, applovin2, false)) {
                    applovin2 = null;
                }
                return applovin2 == null ? BuildConfig.FLAVOR : applovin2;
        }
    }
}
