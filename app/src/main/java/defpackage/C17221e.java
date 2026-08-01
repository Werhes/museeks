package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۘۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17221e {
    public final List ad;

    public C17221e() {
        this.ad = AbstractC6874e.startapp(new C6571e("re.sova.five", "522FA41D301BD4B884EE6AAA7EDC30ABBA5B3D7E"), new C6571e("com.tea.android", "BD7BEC878C5D48E9D4C201050B8EFDA82316F0A8"), new C6571e("ru.utkacraft.vkdirect.dev", "382B654761DD67703E82464968E99714E4A8CCC5"), new C6571e("com.vtosters.android", "C8EAB7342DA62B4A229E1BFDEB27B029DD6788A1"), new C6571e("com.vkmp3mod.android", "545399BC1468D43DD6D2FD6CAAD2EBC6E0FFCBAC"), new C6571e("com.vkontakte.android", "545399BC1468D43DD6D2FD6CAAD2EBC6E0FFCBAC"), new C6571e("com.vkontakte.android", "276114497D5A44F3B2C9403BBEE2DFC903DBFAF1"), new C6571e("com.vtosters.lite", "c3ea27ca14bd72e3e6ae203497b4445adac1f945"), new C6571e("com.vtosters.lite", "C8EAB7342DA62B4A229E1BFDEB27B029DD6788A1"), new C6571e("com.supernova", "276114497D5A44F3B2C9403BBEE2DFC903DBFAF1"));
    }

    public C17221e(C3526e c3526e) {
        List list = c3526e.f7949e;
        if ((c3526e.f7950e & 1) == 1) {
            int i = c3526e.f7951e;
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                C13212e c13212e = (C13212e) obj;
                if (i2 >= i) {
                    c13212e.getClass();
                    C3333e subscription = C13212e.subscription(c13212e);
                    subscription.f7527e |= 2;
                    subscription.f7530e = true;
                    c13212e = subscription.billing();
                    if (!c13212e.ad()) {
                        throw new C14803e();
                    }
                }
                arrayList.add(c13212e);
                i2 = i3;
            }
            list = arrayList;
        }
        this.ad = list;
    }

    public C13212e ad(int i) {
        return (C13212e) this.ad.get(i);
    }
}
