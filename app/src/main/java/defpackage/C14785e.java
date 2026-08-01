package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14785e implements InterfaceC2747e {
    public final /* synthetic */ int ad;
    public final Object metrica;
    public final Object vip;

    public /* synthetic */ C14785e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.smaato(this, interfaceC0732e, list, i);
            case 1:
                C9820e c9820e = (C9820e) this.vip;
                c9820e.measure(View.MeasureSpec.makeMeasureSpec(0, 0), AbstractC9936e.mopub(c9820e, 0, i, c9820e.getLayoutParams().height));
                return c9820e.getMeasuredWidth();
            default:
                return AbstractC5087e.smaato(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
            case 1:
                C9820e c9820e = (C9820e) this.vip;
                c9820e.measure(AbstractC9936e.mopub(c9820e, 0, i, c9820e.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c9820e.getMeasuredHeight();
            default:
                return AbstractC5087e.loadAd(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
            case 1:
                C9820e c9820e = (C9820e) this.vip;
                c9820e.measure(AbstractC9936e.mopub(c9820e, 0, i, c9820e.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return c9820e.getMeasuredHeight();
            default:
                return AbstractC5087e.mopub(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        switch (this.ad) {
            case 0:
                return AbstractC5087e.admob(this, interfaceC0732e, list, i);
            case 1:
                C9820e c9820e = (C9820e) this.vip;
                c9820e.measure(View.MeasureSpec.makeMeasureSpec(0, 0), AbstractC9936e.mopub(c9820e, 0, i, c9820e.getLayoutParams().height));
                return c9820e.getMeasuredWidth();
            default:
                return AbstractC5087e.admob(this, interfaceC0732e, list, i);
        }
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C6571e c6571e;
        switch (this.ad) {
            case 0:
                ((C5385e) this.vip).setParentLayoutDirection((EnumC7792e) this.metrica);
                return interfaceC13158e.ads(0, 0, C9139e.f18290e, C5430e.f11655e);
            case 1:
                C9820e c9820e = (C9820e) this.vip;
                int childCount = c9820e.getChildCount();
                C9139e c9139e = C9139e.f18290e;
                if (childCount == 0) {
                    return interfaceC13158e.ads(C5602e.adcel(j), C5602e.startapp(j), c9139e, C5430e.f11631e);
                }
                if (C5602e.adcel(j) != 0) {
                    c9820e.getChildAt(0).setMinimumWidth(C5602e.adcel(j));
                }
                if (C5602e.startapp(j) != 0) {
                    c9820e.getChildAt(0).setMinimumHeight(C5602e.startapp(j));
                }
                c9820e.measure(AbstractC9936e.mopub(c9820e, C5602e.adcel(j), C5602e.yandex(j), c9820e.getLayoutParams().width), AbstractC9936e.mopub(c9820e, C5602e.startapp(j), C5602e.billing(j), c9820e.getLayoutParams().height));
                return interfaceC13158e.ads(c9820e.getMeasuredWidth(), c9820e.getMeasuredHeight(), c9139e, new C10273e(c9820e, (C13915e) this.metrica, 1));
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = list.get(i);
                    if (!(((InterfaceC16719e) obj).signatures() instanceof C15330e)) {
                        arrayList3.add(obj);
                    }
                }
                List list2 = (List) ((Function0) this.metrica).invoke();
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        C0763e c0763e = (C0763e) list2.get(i2);
                        if (c0763e != null) {
                            float f = c0763e.vip;
                            float f2 = c0763e.ad;
                            arrayList2 = arrayList4;
                            AbstractC2832e admob = ((InterfaceC16719e) arrayList3.get(i2)).admob(AbstractC2278e.vip(0, (int) Math.floor(c0763e.metrica - f2), 0, (int) Math.floor(c0763e.license - f), 5));
                            int round = Math.round(f2);
                            c6571e = new C6571e(admob, new C11490e((Math.round(f) & 4294967295L) | (round << 32)));
                        } else {
                            arrayList2 = arrayList4;
                            c6571e = null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (c6571e != null) {
                            arrayList5.add(c6571e);
                        }
                        i2++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj2 = list.get(i3);
                    if (((InterfaceC16719e) obj2).signatures() instanceof C15330e) {
                        arrayList6.add(obj2);
                    }
                }
                return interfaceC13158e.ads(C5602e.yandex(j), C5602e.billing(j), C9139e.f18290e, new C6265e(arrayList, AbstractC2270e.license(arrayList6, (Function0) this.vip)));
        }
    }
}
