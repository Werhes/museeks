package defpackage;

import androidx.recyclerview.widget.startapp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.message.ConversationElement;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14539e extends AbstractC3655e {

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final String f28749e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final ArrayList f28750e;

    public C14539e() {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f28749e = VKXApplication.Companion.vip(R.string.messages_shared_media);
        this.f28750e = new ArrayList();
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: break */
    public final String mo1348break() {
        return this.f28749e;
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: final */
    public final startapp mo1386final() {
        return new C8967e(this);
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: new */
    public final void mo1389new() {
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: private */
    public final void mo1391private(int i) {
        this.f8224e = true;
        C4600e c4600e = new C4600e(this.f8227e, i);
        final int i2 = 0;
        Function1 function1 = new Function1(this) { // from class: eًٖؒ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C14539e f31637e;

            {
                this.f31637e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [eْۨٝ] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        C14539e c14539e = this.f31637e;
                        c14539e.mo1392strictfp((Exception) ((Throwable) obj));
                        c14539e.f8224e = false;
                        return Unit.INSTANCE;
                    default:
                        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
                        C14539e c14539e2 = this.f31637e;
                        ArrayList arrayList = c14539e2.f8223e;
                        ArrayList arrayList2 = c14539e2.f28750e;
                        Object obj2 = vKResponseWithItems.ad;
                        Iterable iterable = (Iterable) obj2;
                        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((ConversationElement) it.next()).ad);
                        }
                        arrayList.addAll(arrayList3);
                        List list = vKResponseWithItems.metrica;
                        ?? r4 = C13664e.f27089e;
                        if (list == null) {
                            list = r4;
                        }
                        arrayList2.addAll(list);
                        List<VKProfile> list2 = vKResponseWithItems.license;
                        if (list2 != null) {
                            r4 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                            for (VKProfile vKProfile : list2) {
                                vKProfile.ad = -vKProfile.ad;
                                r4.add(vKProfile);
                            }
                        }
                        arrayList2.addAll(r4);
                        c14539e2.f8234e = true;
                        if (((List) obj2).size() < c14539e2.f8227e) {
                            c14539e2.f8237e = false;
                        }
                        c14539e2.m1390package();
                        c14539e2.f8224e = false;
                        return Unit.INSTANCE;
                }
            }
        };
        final int i3 = 1;
        Function1 function12 = new Function1(this) { // from class: eًٖؒ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C14539e f31637e;

            {
                this.f31637e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [eْۨٝ] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        C14539e c14539e = this.f31637e;
                        c14539e.mo1392strictfp((Exception) ((Throwable) obj));
                        c14539e.f8224e = false;
                        return Unit.INSTANCE;
                    default:
                        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
                        C14539e c14539e2 = this.f31637e;
                        ArrayList arrayList = c14539e2.f8223e;
                        ArrayList arrayList2 = c14539e2.f28750e;
                        Object obj2 = vKResponseWithItems.ad;
                        Iterable iterable = (Iterable) obj2;
                        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((ConversationElement) it.next()).ad);
                        }
                        arrayList.addAll(arrayList3);
                        List list = vKResponseWithItems.metrica;
                        ?? r4 = C13664e.f27089e;
                        if (list == null) {
                            list = r4;
                        }
                        arrayList2.addAll(list);
                        List<VKProfile> list2 = vKResponseWithItems.license;
                        if (list2 != null) {
                            r4 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                            for (VKProfile vKProfile : list2) {
                                vKProfile.ad = -vKProfile.ad;
                                r4.add(vKProfile);
                            }
                        }
                        arrayList2.addAll(r4);
                        c14539e2.f8234e = true;
                        if (((List) obj2).size() < c14539e2.f8227e) {
                            c14539e2.f8237e = false;
                        }
                        c14539e2.m1390package();
                        c14539e2.f8224e = false;
                        return Unit.INSTANCE;
                }
            }
        };
        C0609e c0609e = new C0609e(11, c4600e);
        C2046e c2046e = new C2046e(0, function12);
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC5336e.purchase(vKXApplication, null, 0, new C14164e(c2046e, c4600e, function1, c0609e, (InterfaceC5083e) null), 3);
    }
}
