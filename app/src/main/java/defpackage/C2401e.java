package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2401e {
    public boolean Signature;
    public final long ad;
    public final long adcel;
    public C2401e admob;
    public final long advert;
    public final long amazon;
    public final float appmetrica;
    public final long billing;
    public final boolean license;
    public boolean loadAd;
    public final long metrica;
    public final float mopub;
    public final long purchase;
    public final ArrayList smaato;
    public final int startapp;
    public final long vip;
    public final boolean yandex;

    public C2401e(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.smaato = arrayList;
        this.amazon = j8;
    }

    public C2401e(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = z;
        this.appmetrica = f;
        this.purchase = j4;
        this.billing = j5;
        this.yandex = z2;
        this.startapp = i;
        this.adcel = j6;
        this.mopub = f2;
        this.advert = j7;
        this.amazon = 0L;
        this.loadAd = z3;
        this.Signature = z3;
    }

    public final void ad() {
        C2401e c2401e = this.admob;
        if (c2401e == null) {
            this.loadAd = true;
            this.Signature = true;
        } else if (c2401e != null) {
            c2401e.ad();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) AbstractC17751e.license(this.ad));
        sb.append(", uptimeMillis=");
        sb.append(this.vip);
        sb.append(", position=");
        sb.append((Object) C2152e.mopub(this.metrica));
        sb.append(", pressed=");
        sb.append(this.license);
        sb.append(", pressure=");
        sb.append(this.appmetrica);
        sb.append(", previousUptimeMillis=");
        sb.append(this.purchase);
        sb.append(", previousPosition=");
        sb.append((Object) C2152e.mopub(this.billing));
        sb.append(", previousPressed=");
        sb.append(this.yandex);
        sb.append(", isConsumed=");
        sb.append(vip());
        sb.append(", type=");
        sb.append((Object) C15991e.ad(this.startapp));
        sb.append(", historical=");
        Object obj = this.smaato;
        if (obj == null) {
            obj = C13664e.f27089e;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) C2152e.mopub(this.adcel));
        sb.append(", scaleFactor=");
        sb.append(this.mopub);
        sb.append(", panOffset=");
        sb.append((Object) C2152e.mopub(this.advert));
        sb.append(')');
        return sb.toString();
    }

    public final boolean vip() {
        C2401e c2401e = this.admob;
        return c2401e != null ? c2401e.vip() : this.loadAd || this.Signature;
    }
}
