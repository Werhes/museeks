package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17080e implements Closeable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String[] f33418e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int[] f33419e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int[] f33420e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f33421e;

    public abstract boolean Signature();

    public abstract void ad();

    public abstract void ads();

    public abstract void advert();

    /* renamed from: break */
    public abstract void mo2305break();

    /* renamed from: catch, reason: not valid java name */
    public final void m4241catch(String str) {
        StringBuilder isPro = AbstractC8703e.isPro(str, " at path ");
        isPro.append(loadAd());
        throw new IOException(isPro.toString());
    }

    public abstract int crashlytics();

    /* renamed from: extends */
    public abstract int mo2308extends(C16911e c16911e);

    /* renamed from: goto, reason: not valid java name */
    public final void m4242goto(int i) {
        int i2 = this.f33421e;
        int[] iArr = this.f33419e;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C14803e("Nesting too deep at " + loadAd(), 8, (byte) 0);
            }
            this.f33419e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f33418e;
            this.f33418e = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f33420e;
            this.f33420e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f33419e;
        int i3 = this.f33421e;
        this.f33421e = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: implements */
    public abstract void mo2314implements();

    public abstract int inmobi();

    public abstract double isVip();

    public abstract void license();

    public final String loadAd() {
        return AbstractC11203e.license(this.f33421e, this.f33419e, this.f33418e, this.f33420e);
    }

    /* renamed from: protected */
    public abstract int mo2316protected(C16911e c16911e);

    public abstract void purchase();

    public abstract String subs();
}
