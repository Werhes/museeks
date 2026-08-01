package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10366e implements InterfaceC1332e, InterfaceC7224e {
    public final /* synthetic */ C5435e ad;
    public final C9424e appmetrica = new C9424e();
    public final C5609e billing;
    public final ArrayList license;
    public final C13465e metrica;
    public final C5609e purchase;
    public final C6846e vip;
    public final C5609e yandex;

    public C10366e(ArrayList arrayList, C5435e c5435e, C6846e c6846e, C13465e c13465e) {
        this.ad = c5435e;
        this.vip = c6846e;
        this.metrica = c13465e;
        this.license = new ArrayList(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C11973e) it.next()).ad);
        }
        this.purchase = new C5609e(AbstractC8228e.license(arrayList2));
        this.billing = new C5609e((Object) 0);
        C9424e c9424e = this.appmetrica;
        InterfaceC5372e serializer = InterfaceC10940e.Companion.serializer();
        C17566e c17566e = C17566e.INSTANCE;
        this.yandex = AbstractC14437e.vip(this, c9424e, serializer, new C14923e(0, c17566e), false, new C14874e(2, this, C10366e.class, "childFactory", "childFactory(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/VkxPickAudiosSheetComponent$Config;Lcom/arkivanov/decompose/ComponentContext;)Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosSheetComponent$Child;", 0, 0, 15));
    }

    public final void ad(C11973e c11973e) {
        AbstractC11110e firebase;
        C5609e c5609e = this.purchase;
        AbstractC11110e abstractC11110e = (AbstractC11110e) c5609e.startapp();
        String str = c11973e.ad;
        boolean contains = abstractC11110e.contains(str);
        ArrayList arrayList = this.license;
        if (contains) {
            arrayList.remove(c11973e);
            firebase = (AbstractC11110e) c5609e.startapp();
            int indexOf = firebase.indexOf(str);
            if (indexOf != -1) {
                firebase = firebase.mo2799this(indexOf);
            }
        } else {
            arrayList.add(c11973e);
            firebase = ((AbstractC11110e) c5609e.startapp()).firebase(str);
        }
        c5609e.subscription(firebase);
        this.billing.subscription(Integer.valueOf(((AbstractC11110e) c5609e.startapp()).subs()));
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.license;
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.vip;
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.appmetrica;
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.ad;
    }
}
