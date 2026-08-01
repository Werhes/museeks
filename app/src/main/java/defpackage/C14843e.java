package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14843e {
    public final InterfaceC5178e Signature;
    public final View ad;
    public final C8127e adcel;
    public final C14939e admob;
    public final C16615e advert;
    public final InterfaceC14165e amazon;
    public final InterfaceC0816e appmetrica;
    public final C7436e billing;
    public final ComponentCallbacks2C10056e isVip;
    public final InterfaceC10998e license;
    public final InterfaceC3314e loadAd;
    public final InterfaceC16400e metrica;
    public final C1774e mopub;
    public final C16125e pro;
    public final C2843e purchase;
    public final C1692e remoteconfig;
    public int signatures;
    public final C2842e smaato;
    public final InterfaceC3314e startapp;
    public final C4017e subscription;
    public final C17073e tapsense;
    public final AbstractC5830e vip;
    public final Configuration yandex;

    public C14843e(C14843e c14843e, View view, AbstractC5830e abstractC5830e, InterfaceC16400e interfaceC16400e, InterfaceC10998e interfaceC10998e, InterfaceC0816e interfaceC0816e) {
        InterfaceC14165e c5170e;
        C16125e c16125e;
        C4017e c4017e;
        C7436e c7436e;
        View view2;
        boolean billing = AbstractC7890e.billing((c14843e == null || (view2 = c14843e.ad) == null) ? null : view2.getContext(), view.getContext());
        this.ad = view;
        this.vip = abstractC5830e;
        this.metrica = interfaceC16400e;
        this.license = interfaceC10998e;
        this.appmetrica = interfaceC0816e;
        this.purchase = billing ? c14843e.purchase : new C2843e();
        this.billing = (c14843e == null || (c7436e = c14843e.billing) == null) ? new C7436e() : c7436e;
        Configuration configuration = billing ? c14843e.yandex : new Configuration(view.getContext().getResources().getConfiguration());
        this.yandex = configuration;
        this.startapp = billing ? c14843e.startapp : AbstractC14533e.startapp(new Configuration(configuration));
        this.adcel = billing ? c14843e.adcel : new C8127e(view.getContext());
        this.mopub = billing ? c14843e.mopub : new C1774e(view.getContext());
        C16615e c16615e = billing ? c14843e.advert : new C16615e(view.getContext());
        this.advert = c16615e;
        this.smaato = billing ? c14843e.smaato : new C2842e(c16615e);
        if (billing) {
            c5170e = c14843e.amazon;
        } else {
            view.getContext();
            c5170e = new C5170e((byte) 0, 23);
        }
        this.amazon = c5170e;
        this.loadAd = billing ? c14843e.loadAd : new C0576e(AbstractC14430e.purchase(view.getContext()), C10990e.f21769e);
        this.Signature = view == (c14843e != null ? c14843e.ad : null) ? c14843e.Signature : new C6169e(view);
        this.admob = billing ? c14843e.admob : new C14939e(ViewConfiguration.get(view.getContext()));
        this.subscription = (c14843e == null || (c4017e = c14843e.subscription) == null) ? new C4017e() : c4017e;
        this.remoteconfig = new C1692e();
        this.pro = (c14843e == null || (c16125e = c14843e.pro) == null) ? new C16125e() : c16125e;
        this.tapsense = new C17073e(5, this);
        this.isVip = new ComponentCallbacks2C10056e(this);
    }

    public final void ad(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, Function2 function2, C13770e c13770e, int i) {
        char c;
        char c2;
        boolean z;
        c13770e.m3671package(123858079);
        int i2 = 2;
        int i3 = (c13770e.yandex(viewTreeObserverOnGlobalLayoutListenerC5014e) ? 4 : 2) | i | (c13770e.yandex(function2) ? 32 : 16) | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC5014e.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC16555e) && !(tag instanceof InterfaceC7103e))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC5014e.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC16555e) && !(tag2 instanceof InterfaceC7103e))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(c13770e.isVip());
                c13770e.admob = true;
                c13770e.subs = true;
                c13770e.metrica.billing();
                c13770e.f27291goto.billing();
                C14479e c14479e = c13770e.f27296this;
                C18516e c18516e = c14479e.ad;
                c14479e.appmetrica = c18516e.f36303e;
                c14479e.purchase = c18516e.f36306e;
            }
            Object m3681throw = c13770e.m3681throw();
            InterfaceC10998e interfaceC10998e = this.license;
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                View view2 = (View) viewTreeObserverOnGlobalLayoutListenerC5014e.getParent();
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag3 instanceof String ? (String) tag3 : null;
                if (str == null) {
                    str = String.valueOf(view2.getId());
                }
                String Signature = AbstractC17861e.Signature("SaveableStateRegistry:", str);
                C3168e yandex = interfaceC10998e.yandex();
                Bundle isPro = yandex.isPro(Signature);
                if (isPro != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : isPro.keySet()) {
                        linkedHashMap.put(str2, isPro.getParcelableArrayList(str2));
                    }
                }
                c = 0;
                c2 = 4;
                C5430e c5430e = C5430e.f11651e;
                C15492e c15492e = AbstractC5991e.ad;
                C16537e c16537e = new C16537e(linkedHashMap, c5430e);
                if (yandex.m1258e(Signature) == null) {
                    try {
                        yandex.m1261e(Signature, new C14574e(i2, c16537e));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                    }
                    C14185e c14185e = new C14185e(c16537e, new C13089e(z, yandex, Signature));
                    c13770e.m3682throws(c14185e);
                    m3681throw = c14185e;
                }
                z = false;
                C14185e c14185e2 = new C14185e(c16537e, new C13089e(z, yandex, Signature));
                c13770e.m3682throws(c14185e2);
                m3681throw = c14185e2;
            } else {
                c = 0;
                c2 = 4;
            }
            C14185e c14185e3 = (C14185e) m3681throw;
            Unit unit = Unit.INSTANCE;
            boolean yandex2 = c13770e.yandex(c14185e3);
            Object m3681throw2 = c13770e.m3681throw();
            int i4 = 12;
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C17097e(i4, c14185e3);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.vip(unit, (Function1) m3681throw2, c13770e);
            C5015e c5015e = AbstractC11473e.isVip;
            boolean booleanValue = ((Boolean) c13770e.adcel(c5015e)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC5014e.getScrollCaptureInProgress$ui();
            boolean purchase = c13770e.purchase(viewTreeObserverOnGlobalLayoutListenerC5014e.getView());
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase || m3681throw3 == c5170e) {
                viewTreeObserverOnGlobalLayoutListenerC5014e.getView();
                m3681throw3 = new Object();
                c13770e.m3682throws(m3681throw3);
            }
            C14815e ad = AbstractC9179e.ad.ad(this.metrica);
            C14815e ad2 = AbstractC3666e.ad.ad(interfaceC10998e);
            C14815e ad3 = AbstractC2676e.license.ad(this.purchase);
            C14815e ad4 = AbstractC2676e.appmetrica.ad(this.billing);
            C14815e ad5 = AbstractC2676e.vip.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getContext());
            C14815e ad6 = AbstractC4344e.ad.ad(set);
            C14815e ad7 = AbstractC2676e.ad.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getConfiguration());
            C14815e ad8 = AbstractC5991e.ad.ad(c14185e3);
            C14815e ad9 = AbstractC2676e.purchase.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getView());
            C14815e ad10 = c5015e.ad(Boolean.valueOf(booleanValue));
            C14815e ad11 = AbstractC11473e.pro.ad(viewTreeObserverOnGlobalLayoutListenerC5014e.getViewConfiguration());
            C14815e ad12 = AbstractC8908e.ad.ad((C6704e) m3681throw3);
            C14815e[] c14815eArr = new C14815e[12];
            c14815eArr[c] = ad;
            c14815eArr[1] = ad2;
            c14815eArr[2] = ad3;
            c14815eArr[3] = ad4;
            c14815eArr[c2] = ad5;
            c14815eArr[5] = ad6;
            c14815eArr[6] = ad7;
            c14815eArr[7] = ad8;
            c14815eArr[8] = ad9;
            c14815eArr[9] = ad10;
            c14815eArr[10] = ad11;
            c14815eArr[11] = ad12;
            AbstractC1101e.vip(c14815eArr, AbstractC16653e.license(1317454175, new C0513e(viewTreeObserverOnGlobalLayoutListenerC5014e, this, function2), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0513e(this, viewTreeObserverOnGlobalLayoutListenerC5014e, function2, i);
        }
    }

    public final void license(Configuration configuration) {
        C0576e c0576e;
        int updateFrom = this.yandex.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.purchase.ad.entrySet().iterator();
            while (it.hasNext()) {
                C14162e c14162e = (C14162e) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (c14162e == null || Configuration.needNewResources(updateFrom, c14162e.vip)) {
                    it.remove();
                }
            }
            this.startapp.setValue(new Configuration(configuration));
            this.billing.ad();
            if ((268435456 & updateFrom) != 0) {
                this.loadAd.setValue(AbstractC14430e.purchase(this.ad.getContext()));
            }
            if (((-1342235264) & updateFrom) == 0 || (c0576e = this.remoteconfig.vip) == null) {
                return;
            }
            c0576e.setValue(this.tapsense.invoke());
        }
    }

    public final void metrica() {
        int i = this.signatures + 1;
        this.signatures = i;
        if (i == 1) {
            View view = this.ad;
            Context context = view.getContext();
            ComponentCallbacks2C10056e componentCallbacks2C10056e = this.isVip;
            context.registerComponentCallbacks(componentCallbacks2C10056e);
            license(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            C1692e c1692e = this.remoteconfig;
            c1692e.metrica.setValue(Boolean.valueOf(hasWindowFocus));
            C0576e c0576e = c1692e.vip;
            C17073e c17073e = this.tapsense;
            if (c0576e == null) {
                c1692e.ad = c17073e;
            }
            if (c0576e != null) {
                c0576e.setValue(c17073e.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C10056e);
        }
    }

    public final void vip() {
        int i = this.signatures - 1;
        this.signatures = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.signatures = 0;
        }
        if (this.signatures == 0) {
            View view = this.ad;
            Context context = view.getContext();
            ComponentCallbacks2C10056e componentCallbacks2C10056e = this.isVip;
            context.unregisterComponentCallbacks(componentCallbacks2C10056e);
            C1692e c1692e = this.remoteconfig;
            if (c1692e.vip == null) {
                c1692e.ad = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C10056e);
        }
    }
}
