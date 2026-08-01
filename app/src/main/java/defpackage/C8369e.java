package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۧۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8369e {
    public static final String Signature;
    public static final String adcel;
    public static final String advert;
    public static final String amazon;
    public static final String loadAd;
    public static final String mopub;
    public static final String smaato;
    public static final String startapp;
    public final UUID ad;
    public final boolean appmetrica;
    public final AbstractC17475e billing;
    public final boolean license;
    public final AbstractC8507e metrica;
    public final boolean purchase;
    public final Uri vip;
    public final byte[] yandex;

    static {
        String str = AbstractC9413e.ad;
        startapp = Integer.toString(0, 36);
        adcel = Integer.toString(1, 36);
        mopub = Integer.toString(2, 36);
        advert = Integer.toString(3, 36);
        smaato = Integer.toString(4, 36);
        amazon = Integer.toString(5, 36);
        loadAd = Integer.toString(6, 36);
        Signature = Integer.toString(7, 36);
    }

    public C8369e(C3560e c3560e) {
        AbstractC2301e.subscription((c3560e.metrica && ((Uri) c3560e.appmetrica) == null) ? false : true);
        UUID uuid = (UUID) c3560e.license;
        uuid.getClass();
        this.ad = uuid;
        this.vip = (Uri) c3560e.appmetrica;
        this.metrica = (AbstractC8507e) c3560e.purchase;
        this.license = c3560e.ad;
        this.purchase = c3560e.metrica;
        this.appmetrica = c3560e.vip;
        this.billing = (AbstractC17475e) c3560e.billing;
        byte[] bArr = (byte[]) c3560e.yandex;
        this.yandex = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8369e)) {
            return false;
        }
        C8369e c8369e = (C8369e) obj;
        return this.ad.equals(c8369e.ad) && Objects.equals(this.vip, c8369e.vip) && Objects.equals(this.metrica, c8369e.metrica) && this.license == c8369e.license && this.purchase == c8369e.purchase && this.appmetrica == c8369e.appmetrica && this.billing.equals(c8369e.billing) && Arrays.equals(this.yandex, c8369e.yandex);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        Uri uri = this.vip;
        return Arrays.hashCode(this.yandex) + ((this.billing.hashCode() + ((((((((this.metrica.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.license ? 1 : 0)) * 31) + (this.purchase ? 1 : 0)) * 31) + (this.appmetrica ? 1 : 0)) * 31)) * 31);
    }
}
