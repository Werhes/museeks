package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3555e implements InterfaceC14388e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9292e f8013e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f8014e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f8012e = 9223372034707292159L;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f8011e = 0;

    public C3555e(AbstractC9292e abstractC9292e) {
        this.f8013e = abstractC9292e;
    }

    public final InterfaceC0043e ad() {
        this.f8014e = true;
        AbstractC9292e abstractC9292e = this.f8013e;
        InterfaceC0043e mo1472volatile = abstractC9292e.mo1472volatile();
        if (C11490e.vip(this.f8012e, 9223372034707292159L)) {
            this.f8012e = AbstractC17324e.purchase(mo1472volatile.Signature(0L));
            this.f8011e = mo1472volatile.advert();
        }
        abstractC9292e.mo1461continue().f27612e.vip();
        return mo1472volatile;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return Math.round(mo495e(j));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return AbstractC4653e.purchase(this, mo498new(f));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final /* synthetic */ int mo493e(float f) {
        return AbstractC4653e.ad(this, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final /* synthetic */ long mo494e(long j) {
        return AbstractC4653e.appmetrica(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final /* synthetic */ float mo495e(long j) {
        return AbstractC4653e.license(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return i / vip();
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ float firebase(long j) {
        return AbstractC4653e.vip(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return vip() * f;
    }

    public final void metrica(C9340e c9340e, float f) {
        AbstractC9292e abstractC9292e = this.f8013e;
        C17790e c17790e = abstractC9292e.f18509e;
        if (c17790e == null) {
            c17790e = new C17790e(6);
            abstractC9292e.f18509e = c17790e;
        }
        int firebase = AbstractC1660e.firebase(c9340e, (C9340e[]) c17790e.f34879e);
        if (firebase >= 0) {
            float[] fArr = (float[]) c17790e.f34881e;
            if (fArr[firebase] != f) {
                fArr[firebase] = f;
                ((byte[]) c17790e.f34884e)[firebase] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c17790e.f34884e;
                if (bArr[firebase] == 2) {
                    bArr[firebase] = 0;
                    return;
                }
                return;
            }
        }
        int i = c17790e.f34880e;
        C9340e[] c9340eArr = (C9340e[]) c17790e.f34879e;
        if (i == c9340eArr.length) {
            int i2 = i * 2;
            c17790e.f34879e = (C9340e[]) Arrays.copyOf(c9340eArr, i2);
            c17790e.f34881e = Arrays.copyOf((float[]) c17790e.f34881e, i2);
            c17790e.f34884e = Arrays.copyOf((byte[]) c17790e.f34884e, i2);
        }
        ((C9340e[]) c17790e.f34879e)[i] = c9340e;
        ((byte[]) c17790e.f34884e)[i] = 3;
        ((float[]) c17790e.f34881e)[i] = f;
        c17790e.f34880e++;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f8013e.mo499package();
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f8013e.vip();
    }
}
