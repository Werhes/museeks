package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۧۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12141e implements InterfaceC8448e, InterfaceC8826e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C13475e f24422e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13475e f24423e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13475e f24424e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13475e f24425e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13475e f24426e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f24427e;

    public AbstractC12141e() {
        AbstractC2426e.vip(null, new C10865e(this, 0));
        this.f24426e = AbstractC2426e.vip(null, new C10865e(this, 2));
        this.f24424e = AbstractC2426e.vip(null, new C10865e(this, 3));
        this.f24423e = AbstractC2426e.vip(null, new C10865e(this, 4));
        this.f24425e = AbstractC2426e.vip(null, new C10865e(this, 5));
        this.f24422e = AbstractC2426e.vip(null, new C10865e(this, 6));
        this.f24427e = AbstractC18039e.appmetrica(2, new C10865e(this, 7));
    }

    public static Object admob(C12011e c12011e) {
        Class subs = ((InterfaceC18155e) AbstractC12751e.mopub(c12011e)).subs();
        if (subs.isArray()) {
            return Array.newInstance(subs.getComponentType(), 0);
        }
        throw new Error("Cannot instantiate the default empty array of type " + subs.getSimpleName() + ", because it is not an array type");
    }

    @Override // defpackage.InterfaceC15954e
    public final Object Signature(Map map) {
        Object admob;
        if (!crashlytics()) {
            return amazon(map, null);
        }
        List<InterfaceC8960e> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(parameters, 10));
        for (InterfaceC8960e interfaceC8960e : parameters) {
            if (map.containsKey(interfaceC8960e)) {
                admob = map.get(interfaceC8960e);
                if (admob == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC8960e + ')');
                }
            } else {
                C2299e c2299e = (C2299e) interfaceC8960e;
                if (c2299e.amazon()) {
                    admob = null;
                } else {
                    if (!c2299e.admob()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + c2299e);
                    }
                    admob = admob(c2299e.advert());
                }
            }
            arrayList.add(admob);
        }
        InterfaceC9739e billing = billing();
        if (billing != null) {
            try {
                return billing.license(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new C2123e(e);
            }
        }
        throw new Error("This callable does not support a default call: " + isPro());
    }

    @Override // defpackage.InterfaceC15954e
    public final boolean ads() {
        return isPro().mo1718extends() == 4;
    }

    public final Object advert(Object... objArr) {
        try {
            return vip().license(objArr);
        } catch (IllegalAccessException e) {
            throw new C2123e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, eؕٛؓ] */
    public final Object amazon(Map map, C9887e c9887e) {
        List<InterfaceC8960e> parameters = getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return vip().license(tapsense() ? new InterfaceC5083e[]{c9887e} : new InterfaceC5083e[0]);
            } catch (IllegalAccessException e) {
                throw new C2123e(e);
            }
        }
        int size = (tapsense() ? 1 : 0) + parameters.size();
        Object[] objArr = (Object[]) ((Object[]) this.f24422e.invoke()).clone();
        if (tapsense()) {
            objArr[parameters.size()] = c9887e;
        }
        boolean booleanValue = ((Boolean) this.f24427e.getValue()).booleanValue();
        int i = 0;
        for (InterfaceC8960e interfaceC8960e : parameters) {
            int subs = booleanValue ? subs(interfaceC8960e) : 1;
            if (map.containsKey(interfaceC8960e)) {
                objArr[((C2299e) interfaceC8960e).f5814e] = map.get(interfaceC8960e);
            } else {
                C2299e c2299e = (C2299e) interfaceC8960e;
                if (c2299e.amazon()) {
                    if (booleanValue) {
                        int i2 = i + subs;
                        for (int i3 = i; i3 < i2; i3++) {
                            int i4 = (i3 / 32) + size;
                            objArr[i4] = Integer.valueOf(((Integer) objArr[i4]).intValue() | (1 << (i3 % 32)));
                        }
                    } else {
                        int i5 = (i / 32) + size;
                        objArr[i5] = Integer.valueOf(((Integer) objArr[i5]).intValue() | (1 << (i % 32)));
                    }
                    z = true;
                } else if (!c2299e.admob()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + c2299e);
                }
            }
            if (((C2299e) interfaceC8960e).f5813e == 4) {
                i += subs;
            }
        }
        if (!z) {
            try {
                return vip().license(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e2) {
                throw new C2123e(e2);
            }
        }
        InterfaceC9739e billing = billing();
        if (billing != null) {
            try {
                return billing.license(objArr);
            } catch (IllegalAccessException e3) {
                throw new C2123e(e3);
            }
        }
        throw new Error("This callable does not support a default call: " + isPro());
    }

    public final boolean crashlytics() {
        return AbstractC7890e.billing(getName(), "<init>") && smaato().subs().isAnnotation();
    }

    @Override // defpackage.InterfaceC15954e
    public final List getParameters() {
        return (List) this.f24424e.invoke();
    }

    @Override // defpackage.InterfaceC15954e
    public final List getTypeParameters() {
        return (List) this.f24425e.invoke();
    }

    @Override // defpackage.InterfaceC15954e
    public final InterfaceC13984e inmobi() {
        return (InterfaceC13984e) this.f24423e.invoke();
    }

    public abstract InterfaceC0390e isPro();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    public final int subs(InterfaceC8960e interfaceC8960e) {
        if (!((Boolean) this.f24427e.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        C2299e c2299e = (C2299e) interfaceC8960e;
        if (AbstractC5965e.appmetrica(c2299e.advert())) {
            return AbstractC2251e.startapp(AbstractC14430e.vip(c2299e.advert().f24023e)).size();
        }
        return 1;
    }
}
