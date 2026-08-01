package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2832e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f6803e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f6804e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f6806e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f6805e = AbstractC18259e.ad;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f6802e = 0;

    public AbstractC2832e() {
        long j = 0;
        this.f6803e = (j & 4294967295L) | (j << 32);
    }

    /* renamed from: break, reason: not valid java name */
    public int mo1206break() {
        return (int) (this.f6803e >> 32);
    }

    /* renamed from: case, reason: not valid java name */
    public void mo1207case(long j, float f, C16446e c16446e) {
        mo392catch(j, f, null);
    }

    /* renamed from: catch */
    public abstract void mo392catch(long j, float f, Function1 function1);

    /* renamed from: implements, reason: not valid java name */
    public final void m1208implements() {
        this.f6806e = AbstractC3062e.metrica((int) (this.f6803e >> 32), C5602e.adcel(this.f6805e), C5602e.yandex(this.f6805e));
        this.f6804e = AbstractC3062e.metrica((int) (this.f6803e & 4294967295L), C5602e.startapp(this.f6805e), C5602e.billing(this.f6805e));
        int i = this.f6806e;
        long j = this.f6803e;
        this.f6802e = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    /* renamed from: protected, reason: not valid java name */
    public int mo1209protected() {
        return (int) (this.f6803e & 4294967295L);
    }

    public /* synthetic */ Object signatures() {
        return null;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m1210strictfp(long j) {
        if (C5602e.vip(this.f6805e, j)) {
            return;
        }
        this.f6805e = j;
        m1208implements();
    }

    /* renamed from: super, reason: not valid java name */
    public final void m1211super(long j) {
        if (C12729e.vip(this.f6803e, j)) {
            return;
        }
        this.f6803e = j;
        m1208implements();
    }

    /* renamed from: try */
    public abstract int mo393try(AbstractC17016e abstractC17016e);
}
