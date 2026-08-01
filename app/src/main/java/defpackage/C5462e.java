package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5462e implements InterfaceC12179e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f11731e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f11732e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11733e;

    public C5462e(C8198e c8198e, C6194e c6194e, AbstractC0003e abstractC0003e) {
        this.f11733e = 2;
        this.f11732e = c8198e;
        this.f11731e = abstractC0003e;
    }

    public C5462e(InterfaceC12066e interfaceC12066e) {
        this.f11733e = 3;
        this.f11732e = interfaceC12066e;
        C18246e c18246e = C18246e.metrica;
        Class<?> cls = interfaceC12066e.getClass();
        C10951e c10951e = (C10951e) c18246e.ad.get(cls);
        this.f11731e = c10951e == null ? c18246e.ad(cls, null) : c10951e;
    }

    public /* synthetic */ C5462e(Object obj, Object obj2, int i) {
        this.f11733e = i;
        this.f11732e = obj;
        this.f11731e = obj2;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        switch (this.f11733e) {
            case 0:
                InterfaceC13619e interfaceC13619e = (InterfaceC13619e) this.f11732e;
                switch (AbstractC4887e.ad[enumC14621e.ordinal()]) {
                    case 1:
                        interfaceC13619e.purchase();
                        break;
                    case 2:
                        interfaceC13619e.onStart(interfaceC16400e);
                        break;
                    case 3:
                        interfaceC13619e.onResume(interfaceC16400e);
                        break;
                    case 4:
                        interfaceC13619e.onPause(interfaceC16400e);
                        break;
                    case 5:
                        interfaceC13619e.onStop(interfaceC16400e);
                        break;
                    case 6:
                        interfaceC13619e.onDestroy(interfaceC16400e);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new C14803e(10);
                }
                InterfaceC12179e interfaceC12179e = (InterfaceC12179e) this.f11731e;
                if (interfaceC12179e != null) {
                    interfaceC12179e.Signature(interfaceC16400e, enumC14621e);
                    return;
                }
                return;
            case 1:
                if (enumC14621e == EnumC14621e.ON_START) {
                    ((AbstractC0003e) this.f11732e).vip(this);
                    ((C3168e) this.f11731e).m1263e();
                    return;
                }
                return;
            case 2:
                C8198e c8198e = (C8198e) this.f11732e;
                int i = AbstractC14722e.ad[enumC14621e.ordinal()];
                if (i == 1) {
                    c8198e.billing(true);
                    return;
                }
                if (i == 2) {
                    c8198e.billing(false);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    c8198e.appmetrica();
                    ((AbstractC0003e) this.f11731e).vip(this);
                    return;
                }
            default:
                HashMap hashMap = ((C10951e) this.f11731e).ad;
                List list = (List) hashMap.get(enumC14621e);
                Object obj = this.f11732e;
                C10951e.ad(list, interfaceC16400e, enumC14621e, obj);
                C10951e.ad((List) hashMap.get(EnumC14621e.ON_ANY), interfaceC16400e, enumC14621e, obj);
                return;
        }
    }
}
