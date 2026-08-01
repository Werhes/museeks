package defpackage;

import android.view.Surface;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۠٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6696e implements InterfaceC9479e, InterfaceC8427e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13821e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f13822e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13823e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f13824e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13825e;

    public /* synthetic */ C6696e(Object obj, Object obj2, int i, int i2, int i3) {
        this.f13825e = i3;
        this.f13823e = obj;
        this.f13821e = obj2;
        this.f13822e = i;
        this.f13824e = i2;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        BinderC17428e binderC17428e = (BinderC17428e) this.f13823e;
        Surface surface = (Surface) this.f13821e;
        C6268e c6268e = (C6268e) obj;
        ((C6584e) binderC17428e.metrica.get()).getClass();
        if (surface == null) {
            c6268e.mo2143volatile(null);
            binderC17428e.startapp = null;
        } else {
            SurfaceHolderC2120e surfaceHolderC2120e = new SurfaceHolderC2120e(surface, this.f13822e, this.f13824e);
            binderC17428e.startapp = surfaceHolderC2120e;
            c6268e.mo2143volatile(surfaceHolderC2120e);
        }
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f13825e) {
            case 0:
                C4275e c4275e = (C4275e) this.f13823e;
                List list = (List) this.f13821e;
                BinderC4329e binderC4329e = c4275e.metrica;
                C13304e Signature = AbstractC17475e.Signature();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Signature.metrica(((C1962e) list.get(i2)).metrica(c4275e.tapsense(), true));
                }
                BinderC7421e binderC7421e = new BinderC7421e(Signature.billing());
                int tapsense = c4275e.tapsense();
                int i3 = this.f13822e;
                int i4 = this.f13824e;
                if (tapsense >= 2) {
                    interfaceC3001e.mo986e(c4275e.metrica, i, i3, i4, binderC7421e);
                    return;
                } else {
                    interfaceC3001e.mo961e(binderC4329e, i, i4, binderC7421e);
                    interfaceC3001e.mo960e(binderC4329e, i, i3, i4);
                    return;
                }
            default:
                C4275e c4275e2 = (C4275e) this.f13823e;
                interfaceC3001e.mo974e(c4275e2.metrica, i, (Surface) this.f13821e, this.f13822e, this.f13824e);
                return;
        }
    }
}
