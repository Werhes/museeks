package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۢٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3698e implements InterfaceC14388e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f8274e;

    public static void Signature(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = AbstractC18259e.vip;
            function1 = C8082e.f16422e;
        }
        abstractC3698e.getClass();
        ad(abstractC3698e, abstractC2832e);
        abstractC2832e.mo392catch(C11490e.license((i2 & 4294967295L) | (i << 32), abstractC2832e.f6802e), 0.0f, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ad(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e) {
        abstractC3698e.getClass();
        if (abstractC2832e instanceof InterfaceC6911e) {
            ((InterfaceC6911e) abstractC2832e).premium(abstractC3698e.f8274e);
        }
    }

    public static void adcel(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, long j) {
        abstractC3698e.getClass();
        ad(abstractC3698e, abstractC2832e);
        abstractC2832e.mo392catch(C11490e.license(j, abstractC2832e.f6802e), 0.0f, null);
    }

    public static void admob(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, long j) {
        int i = AbstractC18259e.vip;
        C8082e c8082e = C8082e.f16422e;
        abstractC3698e.getClass();
        ad(abstractC3698e, abstractC2832e);
        abstractC2832e.mo392catch(C11490e.license(j, abstractC2832e.f6802e), 0.0f, c8082e);
    }

    public static void advert(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (abstractC3698e.appmetrica() == EnumC7792e.f15794e || abstractC3698e.purchase() == 0) {
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo392catch(C11490e.license(j, abstractC2832e.f6802e), 0.0f, null);
        } else {
            int purchase = (abstractC3698e.purchase() - abstractC2832e.f6806e) - ((int) (j >> 32));
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo392catch(C11490e.license((purchase << 32) | (((int) (j & 4294967295L)) & 4294967295L), abstractC2832e.f6802e), 0.0f, null);
        }
    }

    public static void amazon(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, long j) {
        int i = AbstractC18259e.vip;
        C8082e c8082e = C8082e.f16422e;
        if (abstractC3698e.appmetrica() == EnumC7792e.f15794e || abstractC3698e.purchase() == 0) {
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo392catch(C11490e.license(j, abstractC2832e.f6802e), 0.0f, c8082e);
        } else {
            int purchase = (abstractC3698e.purchase() - abstractC2832e.f6806e) - ((int) (j >> 32));
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo392catch(C11490e.license((((int) (j & 4294967295L)) & 4294967295L) | (purchase << 32), abstractC2832e.f6802e), 0.0f, c8082e);
        }
    }

    public static void loadAd(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, long j, C16446e c16446e) {
        if (abstractC3698e.appmetrica() == EnumC7792e.f15794e || abstractC3698e.purchase() == 0) {
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo1207case(C11490e.license(j, abstractC2832e.f6802e), 0.0f, c16446e);
        } else {
            int purchase = (abstractC3698e.purchase() - abstractC2832e.f6806e) - ((int) (j >> 32));
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo1207case(C11490e.license((((int) (j & 4294967295L)) & 4294967295L) | (purchase << 32), abstractC2832e.f6802e), 0.0f, c16446e);
        }
    }

    public static void smaato(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = AbstractC18259e.vip;
            function1 = C8082e.f16422e;
        }
        long j = (i << 32) | (i2 & 4294967295L);
        if (abstractC3698e.appmetrica() == EnumC7792e.f15794e || abstractC3698e.purchase() == 0) {
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo392catch(C11490e.license(j, abstractC2832e.f6802e), 0.0f, function1);
        } else {
            ad(abstractC3698e, abstractC2832e);
            abstractC2832e.mo392catch(C11490e.license((((abstractC3698e.purchase() - abstractC2832e.f6806e) - ((int) (j >> 32))) << 32) | (((int) (j & 4294967295L)) & 4294967295L), abstractC2832e.f6802e), 0.0f, function1);
        }
    }

    public abstract EnumC7792e appmetrica();

    public final void billing(AbstractC2832e abstractC2832e, int i, int i2, float f) {
        ad(this, abstractC2832e);
        abstractC2832e.mo392catch(C11490e.license((i2 & 4294967295L) | (i << 32), abstractC2832e.f6802e), f, null);
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

    public abstract InterfaceC0043e license();

    public float metrica(C9340e c9340e) {
        return Float.NaN;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    public abstract int purchase();

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }
}
