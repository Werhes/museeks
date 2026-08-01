package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ٓ */
/* loaded from: classes3.dex */
public final class C17779e {
    public InterfaceC15498e ad;
    public final AbstractC1186e adcel;
    public int appmetrica;
    public C8268e metrica;
    public final /* synthetic */ C10162e mopub;
    public final C0520e startapp;
    public int vip;
    public final C16169e yandex;
    public InterfaceC2188e license = null;
    public AbstractC3370e purchase = AbstractC3370e.ad;
    public boolean billing = true;

    public C17779e(C10162e c10162e) {
        this.mopub = c10162e;
        this.ad = c10162e.mo1351switch();
        this.vip = c10162e.mo1718extends();
        this.metrica = c10162e.advert();
        this.appmetrica = c10162e.mo334e();
        this.yandex = c10162e.f20102e;
        this.startapp = c10162e.getName();
        this.adcel = c10162e.ad();
    }

    public static /* synthetic */ void ad(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i == 1) {
            objArr[1] = "setOwner";
        } else if (i == 2) {
            objArr[1] = "setOriginal";
        } else if (i == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i == 5) {
            objArr[1] = "setReturnType";
        } else if (i == 7) {
            objArr[1] = "setModality";
        } else if (i == 9) {
            objArr[1] = "setVisibility";
        } else if (i == 11) {
            objArr[1] = "setKind";
        } else if (i == 19) {
            objArr[1] = "setName";
        } else if (i == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i == 16) {
            objArr[1] = "setSubstitution";
        } else if (i != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v15, types: [eَؙٖ] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r6v11, types: [eَؙٖ] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r9v0, types: [eٍؙۛ, eۣؓۗ, eٌَۢ, java.lang.Object, eِٕٖ] */
    public final C10162e vip() {
        C16169e c16169e;
        C16169e c16169e2;
        int i;
        C7901e c7901e;
        C2042e c2042e;
        C4542e c4542e;
        Function0 function0;
        C16169e c16169e3;
        AbstractC1186e startapp;
        InterfaceC15498e interfaceC15498e = this.ad;
        int i2 = this.vip;
        C8268e c8268e = this.metrica;
        InterfaceC2188e interfaceC2188e = this.license;
        int i3 = this.appmetrica;
        C0520e c0520e = this.startapp;
        C10162e c10162e = this.mopub;
        ?? mo829e = c10162e.mo829e(interfaceC15498e, i2, c8268e, interfaceC2188e, i3, c0520e);
        List typeParameters = c10162e.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C4542e appmetrica = AbstractC9460e.appmetrica(typeParameters, this.purchase, mo829e, arrayList);
        AbstractC1186e abstractC1186e = this.adcel;
        AbstractC1186e startapp2 = appmetrica.startapp(3, abstractC1186e);
        C16169e c16169e4 = null;
        if (startapp2 != null) {
            int i4 = 2;
            AbstractC1186e startapp3 = appmetrica.startapp(2, abstractC1186e);
            if (startapp3 != null) {
                mo829e.mo832e(startapp3);
            }
            C16169e c16169e5 = this.yandex;
            if (c16169e5 != null) {
                C16169e remoteconfig = c16169e5.remoteconfig(appmetrica);
                c16169e = remoteconfig != null ? remoteconfig : null;
            }
            C16169e c16169e6 = c10162e.f20113e;
            if (c16169e6 == null || (startapp = appmetrica.startapp(2, c16169e6.ad())) == null) {
                c16169e2 = null;
            } else {
                c16169e6.m4142e();
                c16169e2 = new C16169e(mo829e, new C13914e(mo829e, startapp), c16169e6.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            for (C16169e c16169e7 : c10162e.f20119e) {
                AbstractC1186e startapp4 = appmetrica.startapp(i4, c16169e7.ad());
                if (startapp4 == null) {
                    c16169e3 = c16169e4;
                } else {
                    c16169e3 = c16169e4;
                    C0520e m3522e = ((C12990e) c16169e7.m4142e()).m3522e();
                    c16169e7.m4142e();
                    c16169e4 = new C16169e(mo829e, new C12990e(mo829e, startapp4, m3522e, 1), c16169e7.getAnnotations());
                }
                if (c16169e4 != null) {
                    arrayList2.add(c16169e4);
                }
                c16169e4 = c16169e3;
                i4 = 2;
            }
            ?? r19 = c16169e4;
            mo829e.m2781e(startapp2, arrayList, c16169e, c16169e2, arrayList2);
            C7901e c7901e2 = c10162e.f20117e;
            C0136e c0136e = InterfaceC3054e.f7112e;
            if (c7901e2 == null) {
                i = 1;
                c7901e = r19;
            } else {
                InterfaceC2460e annotations = c7901e2.getAnnotations();
                int i5 = this.vip;
                C8268e advert = c10162e.f20117e.advert();
                if (this.appmetrica == 2 && AbstractC6050e.appmetrica(AbstractC6050e.purchase(advert.ad.remoteconfig()))) {
                    advert = AbstractC6050e.yandex;
                }
                C8268e c8268e2 = advert;
                C7901e c7901e3 = c10162e.f20117e;
                boolean z = c7901e3.f31289e;
                i = 1;
                boolean z2 = c7901e3.f31288e;
                boolean z3 = c7901e3.f31284e;
                int i6 = this.appmetrica;
                InterfaceC2188e interfaceC2188e2 = this.license;
                c7901e = new C7901e(mo829e, annotations, i5, c8268e2, z, z2, z3, i6, interfaceC2188e2 == null ? r19 : interfaceC2188e2.metrica(), c0136e);
            }
            if (c7901e != null) {
                C7901e c7901e4 = c10162e.f20117e;
                AbstractC1186e abstractC1186e2 = c7901e4.f15974e;
                c7901e.f31282e = C10162e.m2776e(appmetrica, c7901e4);
                c7901e.m2354e(abstractC1186e2 != null ? appmetrica.startapp(3, abstractC1186e2) : r19);
            }
            C2042e c2042e2 = c10162e.f20112e;
            if (c2042e2 == null) {
                c2042e = r19;
            } else {
                InterfaceC2460e annotations2 = c2042e2.getAnnotations();
                int i7 = this.vip;
                C8268e advert2 = c10162e.f20112e.advert();
                if (this.appmetrica == 2 && AbstractC6050e.appmetrica(AbstractC6050e.purchase(advert2.ad.remoteconfig()))) {
                    advert2 = AbstractC6050e.yandex;
                }
                C8268e c8268e3 = advert2;
                C2042e c2042e3 = c10162e.f20112e;
                boolean z4 = c2042e3.f31289e;
                boolean z5 = c2042e3.f31288e;
                boolean z6 = c2042e3.f31284e;
                int i8 = this.appmetrica;
                InterfaceC2188e interfaceC2188e3 = this.license;
                c2042e = new C2042e(mo829e, annotations2, i7, c8268e3, z4, z5, z6, i8, interfaceC2188e3 == null ? r19 : interfaceC2188e3.appmetrica(), c0136e);
            }
            if (c2042e != null) {
                c4542e = appmetrica;
                List m3890e = AbstractC14957e.m3890e(c2042e, c10162e.f20112e.mo330e(), c4542e, false, false, null);
                if (m3890e == null) {
                    m3890e = Collections.singletonList(C2042e.m755e(c2042e, AbstractC2876e.appmetrica(this.ad).amazon(), ((C13043e) c10162e.f20112e.mo330e().get(0)).getAnnotations()));
                }
                if (m3890e.size() != i) {
                    throw new IllegalStateException();
                }
                c2042e.f31282e = C10162e.m2776e(c4542e, c10162e.f20112e);
                C13043e c13043e = (C13043e) m3890e.get(0);
                if (c13043e == null) {
                    C2042e.m756e(6);
                    throw r19;
                }
                c2042e.f5322e = c13043e;
            } else {
                c4542e = appmetrica;
            }
            C10109e c10109e = c10162e.f20109e;
            ?? cpackage = c10109e == null ? r19 : new Cpackage(c10109e.getAnnotations());
            C10109e c10109e2 = c10162e.f20110e;
            mo829e.m2780e(c7901e, c2042e, cpackage, c10109e2 == null ? r19 : new Cpackage(c10109e2.getAnnotations()));
            if (this.billing) {
                int i9 = C7495e.f15273e;
                C7495e billing = AbstractC9464e.billing();
                Iterator it = c10162e.mo337finally().iterator();
                while (it.hasNext()) {
                    billing.add(((InterfaceC2188e) it.next()).remoteconfig(c4542e));
                }
                mo829e.f20100e = billing;
            }
            if (c10162e.mo831e() && (function0 = c10162e.f20116e) != null) {
                mo829e.m2779e(c10162e.f20108e, function0);
            }
            return mo829e;
        }
        return null;
    }
}
