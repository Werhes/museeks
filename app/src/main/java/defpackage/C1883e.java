package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1883e extends AbstractC13345e {
    public final /* synthetic */ int ad = 2;
    public final Object metrica;
    public final Object vip;
    public static final C9981e license = new C9981e(0);
    public static final C9981e appmetrica = new C9981e(3);

    public C1883e(C2065e c2065e, Object obj) {
        this.vip = c2065e;
        this.metrica = obj;
    }

    public C1883e(C14172e c14172e, Type type, Type type2) {
        this.vip = c14172e.ad(type);
        this.metrica = c14172e.ad(type2);
    }

    public C1883e(Class cls, AbstractC13345e abstractC13345e) {
        this.metrica = cls;
        this.vip = abstractC13345e;
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        switch (this.ad) {
            case 0:
                abstractC3442e.ad();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((AbstractC13345e) this.vip).purchase(abstractC3442e, Array.get(obj, i));
                }
                ((C12867e) abstractC3442e).crashlytics(1, 2, ']');
                return;
            case 1:
                abstractC3442e.license();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new C14803e("Map key is null at " + abstractC3442e.advert(), 8, (byte) 0);
                    }
                    int isVip = abstractC3442e.isVip();
                    if (isVip != 5 && isVip != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    abstractC3442e.f7699e = true;
                    ((AbstractC13345e) this.vip).purchase(abstractC3442e, entry.getKey());
                    ((AbstractC13345e) this.metrica).purchase(abstractC3442e, entry.getValue());
                }
                abstractC3442e.purchase();
                return;
            default:
                throw new IllegalArgumentException("Expected one of " + ((C2065e) this.vip).license + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    public String toString() {
        switch (this.ad) {
            case 0:
                return ((AbstractC13345e) this.vip) + ".array()";
            case 1:
                return "JsonAdapter(" + ((AbstractC13345e) this.vip) + "=" + ((AbstractC13345e) this.metrica) + ")";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        switch (this.ad) {
            case 0:
                ArrayList arrayList = new ArrayList();
                abstractC17080e.ad();
                while (abstractC17080e.Signature()) {
                    arrayList.add(((AbstractC13345e) this.vip).vip(abstractC17080e));
                }
                abstractC17080e.purchase();
                Object newInstance = Array.newInstance((Class<?>) this.metrica, arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            case 1:
                C17406e c17406e = new C17406e();
                abstractC17080e.license();
                while (abstractC17080e.Signature()) {
                    C7720e c7720e = (C7720e) abstractC17080e;
                    if (c7720e.Signature()) {
                        c7720e.f15666e = c7720e.m2319volatile();
                        c7720e.f15669e = 11;
                    }
                    Object vip = ((AbstractC13345e) this.vip).vip(abstractC17080e);
                    Object vip2 = ((AbstractC13345e) this.metrica).vip(abstractC17080e);
                    Object put = c17406e.put(vip, vip2);
                    if (put != null) {
                        throw new C14803e("Map key '" + vip + "' has multiple values at path " + abstractC17080e.loadAd() + ": " + put + " and " + vip2, 8, (byte) 0);
                    }
                }
                abstractC17080e.advert();
                return c17406e;
            default:
                abstractC17080e.mo2314implements();
                return this.metrica;
        }
    }
}
