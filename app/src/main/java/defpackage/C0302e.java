package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302e extends AbstractC13616e implements InterfaceC1683e, InterfaceC8501e, InterfaceC18105e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public float f2307e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final InterfaceC2252e f2308e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final float f2309e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C15274e f2310e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final boolean f2311e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C15877e f2312e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public C17835e f2313e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final Function0 f2315e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f2316e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C12344e f2318e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public long f2314e = 0;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C12328e f2317e = new C12328e();

    public C0302e(C15274e c15274e, boolean z, float f, InterfaceC2252e interfaceC2252e, Function0 function0) {
        this.f2310e = c15274e;
        this.f2311e = z;
        this.f2309e = f;
        this.f2308e = interfaceC2252e;
        this.f2315e = function0;
    }

    @Override // defpackage.InterfaceC18105e
    public final /* synthetic */ void Signature(InterfaceC0043e interfaceC0043e) {
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case, reason: not valid java name */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final void mo294e(C4017e c4017e) {
        C14434e c14434e = c4017e.f8940e;
        c4017e.ad();
        C12344e c12344e = this.f2318e;
        if (c12344e != null) {
            float f = this.f2307e;
            long ad = this.f2308e.ad();
            float floatValue = ((Number) ((C7558e) c12344e.f24751e).license()).floatValue();
            if (floatValue > 0.0f) {
                long vip = C3618e.vip(floatValue, ad);
                if (c12344e.f24750e) {
                    float purchase = C2108e.purchase(c4017e.yandex());
                    float metrica = C2108e.metrica(c4017e.yandex());
                    C18478e c18478e = c14434e.f28537e;
                    long m4560try = c18478e.m4560try();
                    c18478e.m4557this().billing();
                    try {
                        ((C5389e) c18478e.f36228e).appmetrica(0.0f, 0.0f, purchase, metrica, 1);
                        AbstractC4653e.mopub(c4017e, vip, f, 0L, null, 124);
                    } finally {
                        AbstractC0054e.m224this(c18478e, m4560try);
                    }
                } else {
                    AbstractC4653e.mopub(c4017e, vip, f, 0L, null, 124);
                }
            }
        }
        InterfaceC14576e m4557this = c14434e.f28537e.m4557this();
        C15877e c15877e = this.f2312e;
        if (c15877e != null) {
            c15877e.appmetrica(this.f2314e, AbstractC1561e.appmetrica(this.f2307e), this.f2308e.ad(), ((C13946e) this.f2315e.invoke()).license);
            Canvas canvas = AbstractC16863e.ad;
            c15877e.draw(((C11648e) m4557this).ad);
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        C17835e c17835e = this.f2313e;
        if (c17835e != null) {
            this.f2312e = null;
            AbstractC12640e.advert(this);
            C3168e c3168e = c17835e.f34944e;
            C15877e c15877e = (C15877e) ((LinkedHashMap) c3168e.f7271e).get(this);
            if (c15877e != null) {
                c15877e.metrica();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c3168e.f7271e;
                C15877e c15877e2 = (C15877e) linkedHashMap.get(this);
                if (c15877e2 != null) {
                }
                linkedHashMap.remove(this);
                c17835e.f34942e.add(c15877e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m295e(InterfaceC10201e interfaceC10201e) {
        C15877e c15877e;
        View view;
        C17835e c17835e;
        if (!(interfaceC10201e instanceof C17612e)) {
            if (interfaceC10201e instanceof C3103e) {
                C15877e c15877e2 = this.f2312e;
                if (c15877e2 != null) {
                    c15877e2.license();
                    return;
                }
                return;
            }
            if (!(interfaceC10201e instanceof C1867e) || (c15877e = this.f2312e) == null) {
                return;
            }
            c15877e.license();
            return;
        }
        C17612e c17612e = (C17612e) interfaceC10201e;
        long j = this.f2314e;
        float f = this.f2307e;
        C17835e c17835e2 = this.f2313e;
        C17835e c17835e3 = c17835e2;
        if (c17835e2 == null) {
            Object obj = (View) AbstractC10432e.vip(this, AbstractC2676e.purchase);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    C17835e c17835e4 = new C17835e(viewGroup.getContext());
                    viewGroup.addView(c17835e4);
                    c17835e = c17835e4;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C17835e) {
                        c17835e = (C17835e) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.f2313e = c17835e;
            c17835e3 = c17835e;
        }
        ArrayList arrayList = c17835e3.f34943e;
        C3168e c3168e = c17835e3.f34944e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c3168e.f7271e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c3168e.f7271e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c3168e.f7272e;
        C15877e c15877e3 = (C15877e) linkedHashMap.get(this);
        View view2 = c15877e3;
        if (c15877e3 == null) {
            ArrayList arrayList2 = c17835e3.f34942e;
            C15877e c15877e4 = (C15877e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            View view3 = c15877e4;
            if (c15877e4 == null) {
                if (c17835e3.f34941e > AbstractC6874e.billing(arrayList)) {
                    View view4 = new View(c17835e3.getContext());
                    c17835e3.addView(view4);
                    arrayList.add(view4);
                    view = view4;
                } else {
                    C15877e c15877e5 = (C15877e) arrayList.get(c17835e3.f34941e);
                    C0302e c0302e = (C0302e) linkedHashMap3.get(c15877e5);
                    view = c15877e5;
                    if (c0302e != null) {
                        c0302e.f2312e = null;
                        AbstractC12640e.advert(c0302e);
                        C15877e c15877e6 = (C15877e) linkedHashMap2.get(c0302e);
                        if (c15877e6 != null) {
                        }
                        linkedHashMap2.remove(c0302e);
                        c15877e5.metrica();
                        view = c15877e5;
                    }
                }
                int i2 = c17835e3.f34941e;
                if (i2 < c17835e3.f34945e - 1) {
                    c17835e3.f34941e = i2 + 1;
                    view3 = view;
                } else {
                    c17835e3.f34941e = 0;
                    view3 = view;
                }
            }
            linkedHashMap2.put(this, view3);
            linkedHashMap3.put(view3, this);
            view2 = view3;
        }
        C15877e c15877e7 = view2;
        c15877e7.vip(c17612e, this.f2311e, j, AbstractC1561e.appmetrica(f), this.f2308e.ad(), ((C13946e) this.f2315e.invoke()).license, new C14515e(5, this));
        this.f2312e = c15877e7;
        AbstractC12640e.advert(this);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        AbstractC5336e.purchase(m3623e(), null, 0, new C8086e(this, (InterfaceC5083e) null, 27), 3);
    }

    @Override // defpackage.InterfaceC12415e
    public final void signatures(long j) {
        float mo497instanceof;
        this.f2316e = true;
        InterfaceC14388e interfaceC14388e = AbstractC5851e.mopub(this).f27604e;
        this.f2314e = AbstractC8116e.startapp(j);
        float f = this.f2309e;
        if (Float.isNaN(f)) {
            long j2 = this.f2314e;
            float f2 = AbstractC13718e.ad;
            mo497instanceof = C2152e.metrica(AbstractC12246e.ad(C2108e.purchase(j2), C2108e.metrica(j2))) / 2.0f;
            if (this.f2311e) {
                mo497instanceof += interfaceC14388e.mo497instanceof(AbstractC13718e.ad);
            }
        } else {
            mo497instanceof = interfaceC14388e.mo497instanceof(f);
        }
        this.f2307e = mo497instanceof;
        C12328e c12328e = this.f2317e;
        Object[] objArr = c12328e.ad;
        int i = c12328e.vip;
        for (int i2 = 0; i2 < i; i2++) {
            m295e((InterfaceC10201e) objArr[i2]);
        }
        c12328e.purchase();
    }
}
