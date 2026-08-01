package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4125e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C3079e f9081e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f9082e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f9083e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f9084e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5874e f9085e = AbstractC12176e.ad(true);
    private volatile /* synthetic */ Object interceptors$delegate = null;

    public AbstractC4125e(C3079e... c3079eArr) {
        this.f9083e = AbstractC6874e.mopub(Arrays.copyOf(c3079eArr, c3079eArr.length));
    }

    public final List Signature() {
        int billing;
        if (((List) this.interceptors$delegate) == null) {
            int i = this.f9082e;
            if (i == 0) {
                this.interceptors$delegate = C13664e.f27089e;
                this.f9084e = false;
                this.f9081e = null;
            } else {
                ArrayList arrayList = this.f9083e;
                if (i == 1 && (billing = AbstractC6874e.billing(arrayList)) >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj = arrayList.get(i2);
                        C15257e c15257e = obj instanceof C15257e ? (C15257e) obj : null;
                        if (c15257e != null && !c15257e.metrica.isEmpty()) {
                            List list = c15257e.metrica;
                            c15257e.license = true;
                            this.interceptors$delegate = list;
                            this.f9084e = false;
                            this.f9081e = c15257e.ad;
                            break;
                        }
                        if (i2 == billing) {
                            break;
                        }
                        i2++;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int billing2 = AbstractC6874e.billing(arrayList);
                if (billing2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj2 = arrayList.get(i3);
                        C15257e c15257e2 = obj2 instanceof C15257e ? (C15257e) obj2 : null;
                        if (c15257e2 != null) {
                            c15257e2.ad(arrayList2);
                        }
                        if (i3 == billing2) {
                            break;
                        }
                        i3++;
                    }
                }
                this.interceptors$delegate = arrayList2;
                this.f9084e = false;
                this.f9081e = null;
            }
        }
        this.f9084e = true;
        return (List) this.interceptors$delegate;
    }

    public void ad() {
    }

    public final void adcel(C3079e c3079e, C3079e c3079e2) {
        if (yandex(c3079e2)) {
            return;
        }
        int purchase = purchase(c3079e);
        if (purchase != -1) {
            this.f9083e.add(purchase, new C15257e(c3079e2, new C0006e(c3079e)));
        } else {
            throw new C3548e("Phase " + c3079e + " was not registered for this pipeline", 4);
        }
    }

    public final void amazon(AbstractC4125e abstractC4125e) {
        ArrayList arrayList = new ArrayList(abstractC4125e.f9083e);
        while (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C3079e c3079e = next instanceof C3079e ? (C3079e) next : null;
                if (c3079e == null) {
                    c3079e = ((C15257e) next).ad;
                }
                if (yandex(c3079e)) {
                    it.remove();
                } else {
                    Object obj = next == c3079e ? C13546e.f26845case : ((C15257e) next).vip;
                    if (!(obj instanceof C13546e)) {
                        if (obj instanceof C0006e) {
                            C3079e c3079e2 = ((C0006e) obj).f1135case;
                            if (yandex(c3079e2)) {
                                adcel(c3079e2, c3079e);
                            }
                        }
                        if (obj instanceof C15730e) {
                            startapp(((C15730e) obj).f30977case, c3079e);
                        }
                    } else if (!yandex(c3079e)) {
                        this.f9083e.add(c3079e);
                    }
                    it.remove();
                }
            }
        }
    }

    public final C15257e appmetrica(C3079e c3079e) {
        ArrayList arrayList = this.f9083e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c3079e) {
                C15257e c15257e = new C15257e(c3079e, C13546e.f26845case);
                arrayList.set(i, c15257e);
                return c15257e;
            }
            if (obj instanceof C15257e) {
                C15257e c15257e2 = (C15257e) obj;
                if (c15257e2.ad == c3079e) {
                    return c15257e2;
                }
            }
        }
        return null;
    }

    public abstract boolean billing();

    public final boolean metrica(AbstractC4125e abstractC4125e) {
        ArrayList arrayList = this.f9083e;
        if (abstractC4125e.f9083e.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = abstractC4125e.f9083e;
        int billing = AbstractC6874e.billing(arrayList2);
        if (billing >= 0) {
            while (true) {
                Object obj = arrayList2.get(i);
                if (obj instanceof C3079e) {
                    arrayList.add(obj);
                } else if (obj instanceof C15257e) {
                    C15257e c15257e = (C15257e) obj;
                    C3079e c3079e = c15257e.ad;
                    AbstractC5857e abstractC5857e = c15257e.vip;
                    c15257e.license = true;
                    arrayList.add(new C15257e(c3079e, abstractC5857e, c15257e.metrica));
                }
                if (i == billing) {
                    break;
                }
                i++;
            }
        }
        this.f9082e += abstractC4125e.f9082e;
        this.interceptors$delegate = abstractC4125e.Signature();
        this.f9084e = true;
        this.f9081e = null;
        return true;
    }

    public final void mopub(C3079e c3079e, Function3 function3) {
        C15257e appmetrica = appmetrica(c3079e);
        if (appmetrica == null) {
            throw new C3548e("Phase " + c3079e + " was not registered for this pipeline", 4);
        }
        List list = (List) this.interceptors$delegate;
        if (!this.f9083e.isEmpty() && list != null && !this.f9084e && (!(list instanceof InterfaceC16555e) || (list instanceof InterfaceC10519e))) {
            if (AbstractC7890e.billing(this.f9081e, c3079e)) {
                list.add(function3);
            } else if (AbstractC7890e.billing(c3079e, AbstractC13480e.m3570break(this.f9083e)) || purchase(c3079e) == AbstractC6874e.billing(this.f9083e)) {
                C15257e appmetrica2 = appmetrica(c3079e);
                if (appmetrica2.license) {
                    appmetrica2.metrica = new ArrayList(appmetrica2.metrica);
                    appmetrica2.license = false;
                }
                appmetrica2.metrica.add(function3);
                list.add(function3);
            }
            this.f9082e++;
            return;
        }
        if (appmetrica.license) {
            appmetrica.metrica = new ArrayList(appmetrica.metrica);
            appmetrica.license = false;
        }
        appmetrica.metrica.add(function3);
        this.f9082e++;
        this.interceptors$delegate = null;
        this.f9084e = false;
        this.f9081e = null;
        ad();
    }

    public final int purchase(C3079e c3079e) {
        ArrayList arrayList = this.f9083e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c3079e || ((obj instanceof C15257e) && ((C15257e) obj).ad == c3079e)) {
                return i;
            }
        }
        return -1;
    }

    public final void smaato(AbstractC4125e abstractC4125e) {
        if (metrica(abstractC4125e)) {
            return;
        }
        amazon(abstractC4125e);
        if (this.f9082e == 0) {
            this.interceptors$delegate = abstractC4125e.Signature();
            this.f9084e = true;
            this.f9081e = null;
        } else {
            this.interceptors$delegate = null;
            this.f9084e = false;
            this.f9081e = null;
        }
        Iterator it = abstractC4125e.f9083e.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C3079e c3079e = next instanceof C3079e ? (C3079e) next : null;
            if (c3079e == null) {
                c3079e = ((C15257e) next).ad;
            }
            if (next instanceof C15257e) {
                C15257e c15257e = (C15257e) next;
                if (!c15257e.metrica.isEmpty()) {
                    C15257e appmetrica = appmetrica(c3079e);
                    if (!c15257e.metrica.isEmpty()) {
                        if (appmetrica.metrica.isEmpty()) {
                            c15257e.license = true;
                            appmetrica.metrica = c15257e.metrica;
                            appmetrica.license = true;
                        } else {
                            if (appmetrica.license) {
                                appmetrica.metrica = new ArrayList(appmetrica.metrica);
                                appmetrica.license = false;
                            }
                            c15257e.ad(appmetrica.metrica);
                        }
                    }
                    this.f9082e = c15257e.metrica.size() + this.f9082e;
                }
            }
        }
    }

    public final void startapp(C3079e c3079e, C3079e c3079e2) {
        AbstractC5857e abstractC5857e;
        if (yandex(c3079e2)) {
            return;
        }
        int purchase = purchase(c3079e);
        if (purchase == -1) {
            throw new C3548e("Phase " + c3079e + " was not registered for this pipeline", 4);
        }
        int i = purchase + 1;
        ArrayList arrayList = this.f9083e;
        int billing = AbstractC6874e.billing(arrayList);
        if (i <= billing) {
            while (true) {
                Object obj = arrayList.get(i);
                C15257e c15257e = obj instanceof C15257e ? (C15257e) obj : null;
                if (c15257e != null && (abstractC5857e = c15257e.vip) != null) {
                    C15730e c15730e = abstractC5857e instanceof C15730e ? (C15730e) abstractC5857e : null;
                    if (c15730e != null && c15730e.f30977case.equals(c3079e)) {
                        purchase = i;
                    }
                    if (i == billing) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(purchase + 1, new C15257e(c3079e2, new C15730e(c3079e)));
    }

    public final Object vip(Object obj, Object obj2, AbstractC10731e abstractC10731e) {
        InterfaceC8850e admob = abstractC10731e.admob();
        List Signature = Signature();
        return ((AbstractC6917e.ad || billing()) ? new C13658e(obj, Signature, obj2, admob) : new C16428e(obj2, obj, Signature)).ad(obj2, abstractC10731e);
    }

    public final boolean yandex(C3079e c3079e) {
        ArrayList arrayList = this.f9083e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c3079e) {
                return true;
            }
            if ((obj instanceof C15257e) && ((C15257e) obj).ad == c3079e) {
                return true;
            }
        }
        return false;
    }
}
