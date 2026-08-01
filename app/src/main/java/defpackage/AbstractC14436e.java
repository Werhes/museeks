package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14436e {
    public static final int[] ad = {R.attr.theme, ua.itaysonlab.vkx.R.attr.theme};
    public static final int[] vip = {ua.itaysonlab.vkx.R.attr.materialThemeOverlay};

    public static final void ad(int i, int i2) {
        if (i != i2) {
            throw new IllegalArgumentException(AbstractC8647e.inmobi(i, i2, "Class declares ", " type parameters, but ", " were provided."));
        }
    }

    public static final String appmetrica(C11997e c11997e, C7936e c7936e) {
        String obj;
        C11997e c11997e2 = c11997e.f23979e;
        String appmetrica = c11997e2 != null ? appmetrica(c11997e2, c7936e) : null;
        Object obj2 = c11997e.f23980e;
        InterfaceC1012e interfaceC1012e = obj2 instanceof InterfaceC1012e ? (InterfaceC1012e) obj2 : null;
        if (interfaceC1012e == null) {
            return appmetrica == null ? BuildConfig.FLAVOR : appmetrica;
        }
        if ((interfaceC1012e instanceof C18110e) || (interfaceC1012e instanceof C3176e) || (interfaceC1012e instanceof C6810e) || interfaceC1012e.equals(C18358e.vip) || (interfaceC1012e instanceof C17695e) || (interfaceC1012e instanceof C6084e)) {
            obj = interfaceC1012e.toString();
        } else {
            if (!interfaceC1012e.equals(C5804e.vip)) {
                throw new C14803e(10);
            }
            obj = "/";
        }
        return appmetrica == null ? obj : obj.length() == 0 ? appmetrica : (AbstractC5304e.premium(appmetrica, '/') || AbstractC5304e.m1864instanceof(obj, '/')) ? appmetrica.concat(obj) : AbstractC0869e.tapsense('/', appmetrica, obj);
    }

    public static final AbstractC8761e license(InterfaceC0861e interfaceC0861e, List list, boolean z, List list2, InterfaceC7227e interfaceC7227e) {
        InterfaceC4077e interfaceC4077e;
        InterfaceC0023e c15786e;
        if (!AbstractC17749e.ad) {
            InterfaceC7227e interfaceC7227e2 = interfaceC0861e instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC0861e : null;
            List vip2 = interfaceC7227e2 != null ? AbstractC10589e.vip(interfaceC7227e2) : null;
            if (vip2 == null) {
                vip2 = C13664e.f27089e;
            }
            ad(vip2.size(), list.size());
            return new C14377e(interfaceC0861e, list, z, list2, null, false, false, false, interfaceC7227e, null);
        }
        if (interfaceC0861e instanceof C8404e) {
            interfaceC4077e = ((C8404e) interfaceC0861e).m2424catch();
        } else {
            if (!(interfaceC0861e instanceof C17936e)) {
                throw new Error("Cannot create type for an unsupported classifier: " + interfaceC0861e + " (" + interfaceC0861e.getClass() + ')');
            }
            C17936e c17936e = (C17936e) interfaceC0861e;
            InterfaceC16046e interfaceC16046e = c17936e.f35174e;
            if (interfaceC16046e == null) {
                throw new IllegalStateException(("Descriptor-less type parameter: " + c17936e).toString());
            }
            interfaceC4077e = interfaceC16046e;
        }
        ad(interfaceC4077e.mo1459goto().getParameters().size(), list.size());
        InterfaceC5021e mo1459goto = interfaceC4077e.mo1459goto();
        List parameters = mo1459goto.getParameters();
        C6557e.f13492e.getClass();
        C6557e c6557e = C6557e.f13491e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            C5538e c5538e = (C5538e) obj;
            C12011e c12011e = (C12011e) c5538e.vip;
            AbstractC1186e abstractC1186e = c12011e != null ? c12011e.f24023e : null;
            int i3 = c5538e.ad;
            int i4 = i3 == 0 ? -1 : AbstractC16445e.ad[AbstractC8703e.m2467class(i3)];
            if (i4 == -1) {
                c15786e = new C15786e((InterfaceC16046e) parameters.get(i));
            } else if (i4 == 1) {
                c15786e = new C7878e(1, abstractC1186e);
            } else if (i4 == 2) {
                c15786e = new C7878e(2, abstractC1186e);
            } else {
                if (i4 != 3) {
                    throw new C14803e(10);
                }
                c15786e = new C7878e(3, abstractC1186e);
            }
            arrayList.add(c15786e);
            i = i2;
        }
        return new C12011e(AbstractC1596e.license(c6557e, mo1459goto, arrayList, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, eْۨٝ] */
    public static AbstractC8761e metrica(InterfaceC0861e interfaceC0861e, ArrayList arrayList, int i) {
        int i2 = i & 1;
        ?? r0 = C13664e.f27089e;
        if (i2 != 0) {
            arrayList = r0;
        }
        return license(interfaceC0861e, arrayList, false, r0, null);
    }

    public static Context purchase(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vip, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof C4411e) && ((C4411e) context).ad == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C4411e c4411e = new C4411e(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ad);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c4411e.getTheme().applyStyle(resourceId2, true);
        }
        return c4411e;
    }

    public static final void vip(InterfaceC5052e interfaceC5052e, LinkedHashSet linkedHashSet, InterfaceC8528e interfaceC8528e, boolean z) {
        for (InterfaceC15498e interfaceC15498e : AbstractC6261e.vip(interfaceC8528e, C4942e.loadAd, 2)) {
            if (interfaceC15498e instanceof InterfaceC5052e) {
                InterfaceC5052e interfaceC5052e2 = (InterfaceC5052e) interfaceC15498e;
                if (interfaceC5052e2.mo1942e()) {
                    InterfaceC4077e appmetrica = interfaceC8528e.appmetrica(interfaceC5052e2.getName(), EnumC2192e.f5576e);
                    interfaceC5052e2 = appmetrica instanceof InterfaceC5052e ? (InterfaceC5052e) appmetrica : appmetrica instanceof InterfaceC9794e ? ((C14457e) ((InterfaceC9794e) appmetrica)).m3805e() : null;
                }
                if (interfaceC5052e2 != null) {
                    int i = AbstractC14300e.ad;
                    Iterator it = interfaceC5052e2.mo1459goto().ad().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC14300e.amazon((AbstractC1186e) it.next(), interfaceC5052e.vip())) {
                                linkedHashSet.add(interfaceC5052e2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        vip(interfaceC5052e, linkedHashSet, interfaceC5052e2.mo1730e(), z);
                    }
                }
            }
        }
    }
}
