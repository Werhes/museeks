package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٝۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9615e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f19062e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19063e;

    public /* synthetic */ AbstractC9615e() {
        this.f19063e = 0;
    }

    public /* synthetic */ AbstractC9615e(int i, int i2) {
        this.f19063e = i2;
        this.f19062e = i;
    }

    public static String vip(int i) {
        return BuildConfig.FLAVOR + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public void ad(int i) {
        this.f19062e = i | this.f19062e;
    }

    public abstract int appmetrica();

    public abstract int billing();

    public abstract int license();

    public boolean metrica(int i) {
        return (this.f19062e & i) == i;
    }

    public List mopub() {
        return C13664e.f27089e;
    }

    public abstract String smaato();

    public abstract int startapp();

    public String toString() {
        switch (this.f19063e) {
            case 3:
                return vip(this.f19062e);
            default:
                return super.toString();
        }
    }

    public abstract int yandex();
}
