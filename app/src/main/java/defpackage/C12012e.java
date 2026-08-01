package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12012e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3861e f24025e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24026e;

    public /* synthetic */ C12012e(C3861e c3861e, int i) {
        this.f24026e = i;
        this.f24025e = c3861e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24026e) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) obj;
                C3861e c3861e = this.f24025e;
                List premium = AbstractC13480e.premium(c3861e.f8700e);
                AppActivity appActivity = (AppActivity) c3861e.pro();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(premium, 10));
                Iterator it = premium.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC6914e.purchase((AudioTrack) it.next()));
                }
                C18231e c18231e = new C18231e(arrayList);
                String purchase = AbstractC6914e.purchase(audioTrack);
                AbstractC13201e.metrica(appActivity, c18231e, new C0086e(purchase != null ? new C1703e(purchase) : C2406e.ad, 0L, premium, false, false, false, 122));
                return Unit.INSTANCE;
            case 1:
                VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
                String str = vKResponseWithItems.appmetrica;
                C3861e c3861e2 = this.f24025e;
                c3861e2.f8694e = str;
                c3861e2.f8237e = !(str == null || str.length() == 0);
                LinkedHashMap linkedHashMap = c3861e2.f8699e.yandex;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List list = vKResponseWithItems.metrica;
                if (list != null) {
                    int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
                    if (appmetrica < 16) {
                        appmetrica = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(appmetrica);
                    for (Object obj2 : list) {
                        linkedHashMap3.put(String.valueOf(((VKProfile) obj2).ad), obj2);
                    }
                    linkedHashMap2.putAll(linkedHashMap3);
                }
                List list2 = vKResponseWithItems.license;
                if (list2 != null) {
                    int appmetrica2 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list2, 10));
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(appmetrica2 >= 16 ? appmetrica2 : 16);
                    for (Object obj3 : list2) {
                        linkedHashMap4.put(String.valueOf(-((VKProfile) obj3).ad), obj3);
                    }
                    linkedHashMap2.putAll(linkedHashMap4);
                }
                linkedHashMap.putAll(linkedHashMap2);
                return Unit.INSTANCE;
            default:
                C3861e c3861e3 = this.f24025e;
                c3861e3.f8697e = null;
                c3861e3.f8696e = null;
                c3861e3.mo1388instanceof();
                return Unit.INSTANCE;
        }
    }
}
