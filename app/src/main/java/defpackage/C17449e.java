package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17449e implements InterfaceC4868e {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C17449e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eؙۦۦ] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // defpackage.InterfaceC4868e
    public final void ad(Object obj) {
        C9029e c9029e;
        ?? r2;
        C3862e c3862e;
        C16722e c16722e;
        ?? r5;
        switch (this.ad) {
            case 0:
                List list = (List) obj;
                if (!((C9029e) this.vip).advert.get() || (r2 = (c9029e = (C9029e) this.vip).purchase) == 0 || (c3862e = c9029e.billing) == null || (c16722e = c9029e.startapp) == null) {
                    return;
                }
                if (list != null) {
                    r5 = new ArrayList(AbstractC0746e.subscription(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r5.add(((C14131e) it.next()).ad());
                    }
                } else {
                    r5 = C13664e.f27089e;
                }
                if (r2 instanceof C6797e) {
                    try {
                        ?? r11 = ((C9029e) this.vip).mopub;
                        Iterable m3575continue = r2.adcel.get() ? C13664e.f27089e : AbstractC13480e.m3575continue(r2.ad(r5));
                        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3575continue, 10));
                        Iterator it2 = m3575continue.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(AbstractC11906e.yandex((String) it2.next(), null, null));
                        }
                        Set smaato = AbstractC4511e.smaato(AbstractC13480e.m3582e(r11), AbstractC13480e.m3582e(arrayList));
                        if (!smaato.isEmpty() && c16722e.advert(c3862e.license(), smaato)) {
                            AbstractC9464e.remoteconfig("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                            return;
                        }
                    } catch (Exception e) {
                        AbstractC9464e.pro("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                    }
                }
                try {
                    r2.license(r5);
                    Set vip = r2.vip();
                    ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(vip, 10));
                    Iterator it3 = vip.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(AbstractC11906e.yandex((String) it3.next(), null, null));
                    }
                    if (arrayList2.equals(((C9029e) this.vip).mopub)) {
                        return;
                    }
                    C9029e c9029e2 = (C9029e) this.vip;
                    List m3575continue2 = AbstractC13480e.m3575continue(c9029e2.mopub);
                    if (arrayList2.equals(m3575continue2)) {
                        return;
                    }
                    synchronized (c9029e2.license) {
                        try {
                            if (c9029e2.appmetrica != null) {
                                AbstractC9464e.yandex("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                                c9029e2.appmetrica.cancel(false);
                                c9029e2.appmetrica = null;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Set m3582e = AbstractC13480e.m3582e(m3575continue2);
                    Set m3582e2 = AbstractC13480e.m3582e(arrayList2);
                    Set smaato2 = AbstractC4511e.smaato(m3582e2, m3582e);
                    Set smaato3 = AbstractC4511e.smaato(m3582e, m3582e2);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((C14131e) it4.next()).ad());
                    }
                    try {
                        Iterator it5 = smaato3.iterator();
                        while (it5.hasNext()) {
                            c9029e2.license(((C14131e) it5.next()).ad());
                        }
                        C3862e c3862e2 = c9029e2.billing;
                        if (c3862e2 != null) {
                            AbstractC9464e.yandex("CameraPresencePrvdr", "Updating CameraRepository...");
                            c3862e2.ad(arrayList4);
                            arrayList3.add(c3862e2);
                            AbstractC9464e.yandex("CameraPresencePrvdr", "CameraRepository updated successfully.");
                        }
                        if (!c9029e2.smaato.isEmpty()) {
                            AbstractC9464e.yandex("CameraPresencePrvdr", "Updating " + c9029e2.smaato.size() + " dependent listeners...");
                            Iterator it6 = c9029e2.smaato.iterator();
                            while (it6.hasNext()) {
                                InterfaceC6343e interfaceC6343e = (InterfaceC6343e) it6.next();
                                interfaceC6343e.ad(arrayList4);
                                arrayList3.add(interfaceC6343e);
                            }
                        }
                        c9029e2.mopub = arrayList2;
                        Iterator it7 = smaato2.iterator();
                        while (it7.hasNext()) {
                            c9029e2.vip(((C14131e) it7.next()).ad());
                        }
                        c9029e2.metrica(smaato2, smaato3);
                        return;
                    } catch (Exception e2) {
                        AbstractC9464e.mopub("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e2);
                        ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(m3575continue2, 10));
                        Iterator it8 = m3575continue2.iterator();
                        while (it8.hasNext()) {
                            arrayList5.add(((C14131e) it8.next()).ad());
                        }
                        Iterator it9 = new C11401e(arrayList3).iterator();
                        while (true) {
                            C0053e c0053e = (C0053e) it9;
                            if (!((ListIterator) c0053e.f1190e).hasPrevious()) {
                                Iterator it10 = smaato3.iterator();
                                while (it10.hasNext()) {
                                    c9029e2.vip(((C14131e) it10.next()).ad());
                                }
                                Iterator it11 = smaato2.iterator();
                                while (it11.hasNext()) {
                                    c9029e2.license(((C14131e) it11.next()).ad());
                                }
                                return;
                            }
                            InterfaceC6343e interfaceC6343e2 = (InterfaceC6343e) ((ListIterator) c0053e.f1190e).previous();
                            try {
                                interfaceC6343e2.ad(arrayList5);
                            } catch (Exception e3) {
                                AbstractC9464e.mopub("CameraPresencePrvdr", "Failed to rollback listener: " + interfaceC6343e2, e3);
                            }
                        }
                    }
                } catch (Exception e4) {
                    AbstractC9464e.pro("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e4);
                    return;
                }
                break;
            case 1:
                ((InterfaceC0867e) this.vip).accept(obj);
                return;
            default:
                C17343e c17343e = (C17343e) obj;
                C16864e c16864e = (C16864e) this.vip;
                if (c17343e == null) {
                    throw new IllegalArgumentException("StreamInfo can't be null");
                }
                int i = c17343e.ad;
                if (c16864e.isPro == 3) {
                    return;
                }
                AbstractC9464e.yandex("VideoCapture", "Stream info update: old: " + c16864e.signatures + " new: " + c17343e);
                C17343e c17343e2 = c16864e.signatures;
                c16864e.signatures = c17343e;
                C6884e c6884e = c16864e.startapp;
                c6884e.getClass();
                int i2 = c17343e2.ad;
                Set set = C17343e.license;
                if (!set.contains(Integer.valueOf(i2)) && !set.contains(Integer.valueOf(i)) && i2 != i) {
                    c16864e.m4187abstract();
                    return;
                }
                int i3 = c17343e2.ad;
                if ((i3 != -1 && i == -1) || (i3 == -1 && i != -1)) {
                    c16864e.m4191native(c16864e.tapsense, c17343e, c6884e);
                    Object[] objArr = {c16864e.tapsense.metrica()};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    c16864e.m4158class(DesugarCollections.unmodifiableList(arrayList6));
                    c16864e.admob();
                    return;
                }
                if (c17343e2.vip != c17343e.vip) {
                    c16864e.m4191native(c16864e.tapsense, c17343e, c6884e);
                    Object[] objArr2 = {c16864e.tapsense.metrica()};
                    ArrayList arrayList7 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList7.add(obj3);
                    c16864e.m4158class(DesugarCollections.unmodifiableList(arrayList7));
                    Iterator it12 = c16864e.ad.iterator();
                    while (it12.hasNext()) {
                        ((InterfaceC0876e) it12.next()).purchase(c16864e);
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC4868e
    public final void onError(Throwable th) {
        switch (this.ad) {
            case 0:
                C9029e c9029e = (C9029e) this.vip;
                if (c9029e.advert.get()) {
                    AbstractC9464e.mopub("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
                    C8765e c8765e = c9029e.yandex;
                    if (c8765e != null) {
                        c8765e.startapp();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AbstractC9464e.mopub("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                return;
            default:
                AbstractC9464e.pro("VideoCapture", "Receive onError from StreamState observer", th);
                return;
        }
    }
}
