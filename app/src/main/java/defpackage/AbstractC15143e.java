package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۨۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15143e {
    public static final byte[] ad = new byte[0];

    public static final Drawable ad(InterfaceC4082e interfaceC4082e, Resources resources) {
        return interfaceC4082e instanceof C3519e ? ((C3519e) interfaceC4082e).ad : interfaceC4082e instanceof C9814e ? new BitmapDrawable(resources, ((C9814e) interfaceC4082e).ad) : new C9291e(1, interfaceC4082e);
    }

    public static InterfaceC18515e appmetrica(C3953e c3953e) {
        AbstractC12699e abstractC12699e = c3953e.appmetrica;
        if (abstractC12699e instanceof C15694e) {
            return new C5401e((C15694e) abstractC12699e);
        }
        if (abstractC12699e instanceof C11897e) {
            return new C13572e((C11897e) abstractC12699e);
        }
        if (abstractC12699e instanceof C14664e) {
            return new C13572e((C14664e) abstractC12699e);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: " + abstractC12699e);
    }

    public static final void billing(View view, InterfaceC0816e interfaceC0816e) {
        view.setTag(R.id.view_tree_view_model_store_owner, interfaceC0816e);
    }

    public static final InterfaceC0816e license(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            InterfaceC0816e interfaceC0816e = tag instanceof InterfaceC0816e ? (InterfaceC0816e) tag : null;
            if (interfaceC0816e != null) {
                return interfaceC0816e;
            }
            Object appmetrica = AbstractC9110e.appmetrica(view);
            view = appmetrica instanceof View ? (View) appmetrica : null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [eْؒ٘, java.lang.Object] */
    public static AbstractC1037e metrica(AbstractC1037e... abstractC1037eArr) {
        List asList = Arrays.asList(abstractC1037eArr);
        return asList.isEmpty() ? new Object() : asList.size() == 1 ? (AbstractC1037e) asList.get(0) : new C11606e(asList);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, eٔۦْ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, eٔۦْ] */
    public static final C8933e purchase(final boolean z, Function0 function0, C13770e c13770e) {
        float f = AbstractC8906e.ad;
        float f2 = AbstractC8906e.vip;
        if (C15765e.ad(f, 0) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (m3681throw == obj) {
            m3681throw = AbstractC17680e.startapp(c13770e);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
        InterfaceC3314e mopub = AbstractC14533e.mopub(function0, c13770e);
        final ?? obj2 = new Object();
        final ?? obj3 = new Object();
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
        obj2.f29883e = interfaceC14388e.mo497instanceof(f);
        obj3.f29883e = interfaceC14388e.mo497instanceof(f2);
        boolean purchase = c13770e.purchase(interfaceC18435e);
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase || m3681throw2 == obj) {
            m3681throw2 = new C8933e(interfaceC18435e, mopub, obj3.f29883e, obj2.f29883e);
            c13770e.m3682throws(m3681throw2);
        }
        final C8933e c8933e = (C8933e) m3681throw2;
        boolean yandex = c13770e.yandex(c8933e) | c13770e.billing(z) | c13770e.metrica(obj2.f29883e) | c13770e.metrica(obj3.f29883e);
        Object m3681throw3 = c13770e.m3681throw();
        if (yandex || m3681throw3 == obj) {
            m3681throw3 = new Function0() { // from class: eؚؔٗ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    C8933e c8933e2 = C8933e.this;
                    boolean vip = c8933e2.vip();
                    InterfaceC18435e interfaceC18435e2 = c8933e2.ad;
                    C2616e c2616e = c8933e2.yandex;
                    boolean z2 = z;
                    if (vip != z2) {
                        c8933e2.license.setValue(Boolean.valueOf(z2));
                        c8933e2.purchase.startapp(0.0f);
                        AbstractC5336e.purchase(interfaceC18435e2, null, 0, new C2415e(c8933e2, z2 ? c2616e.purchase() : 0.0f, null), 3);
                    }
                    c8933e2.billing.startapp(obj2.f29883e);
                    float f3 = obj3.f29883e;
                    if (c2616e.purchase() != f3) {
                        c2616e.startapp(f3);
                        if (c8933e2.vip()) {
                            AbstractC5336e.purchase(interfaceC18435e2, null, 0, new C2415e(c8933e2, f3, null), 3);
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            c13770e.m3682throws(m3681throw3);
        }
        AbstractC17680e.purchase((Function0) m3681throw3, c13770e);
        return c8933e;
    }

    public static final InterfaceC4082e vip(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new C9814e(((BitmapDrawable) drawable).getBitmap()) : new C3519e(drawable);
    }
}
