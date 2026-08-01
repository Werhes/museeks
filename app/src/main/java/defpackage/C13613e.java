package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.mongodb.kbson.BsonObjectId$Companion;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13613e implements InterfaceC5372e {
    public static final C13613e ad = new Object();
    public static final InterfaceC9998e metrica;
    public static final InterfaceC5372e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eْۤٞ, java.lang.Object] */
    static {
        InterfaceC5372e serializer = C15915e.Companion.serializer();
        vip = serializer;
        metrica = serializer.appmetrica();
    }

    public static void purchase(InterfaceC5757e interfaceC5757e, C2453e c2453e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        vip.ad(interfaceC5757e, new C15915e(c2453e));
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C2453e) obj);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return metrica;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        if (!(interfaceC11754e instanceof InterfaceC1527e)) {
            throw new IllegalArgumentException(AbstractC10257e.yandex("Unknown decoder type: ", interfaceC11754e));
        }
        C15915e c15915e = (C15915e) vip.metrica(interfaceC11754e);
        c15915e.getClass();
        BsonObjectId$Companion bsonObjectId$Companion = C2453e.Companion;
        String str = c15915e.ad;
        bsonObjectId$Companion.getClass();
        if (str.length() != 24) {
            throw new IllegalArgumentException(AbstractC17861e.advert(']', "invalid hexadecimal representation of an ObjectId: [", str).toString());
        }
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (AbstractC7890e.yandex(charAt, 48) < 0 || AbstractC7890e.yandex(charAt, 57) > 0 || AbstractC7890e.yandex(charAt, 97) < 0 || AbstractC7890e.yandex(charAt, 102) > 0 || AbstractC7890e.yandex(charAt, 65) < 0 || AbstractC7890e.yandex(charAt, 70) > 0) {
                }
            }
            ArrayList isVip = AbstractC5304e.isVip(2, str);
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(isVip, 10));
            Iterator it = isVip.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                AbstractC15211e.ad(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
            }
            return BsonObjectId$Companion.ad(AbstractC13480e.m3585finally(arrayList));
        }
        throw new IllegalArgumentException(AbstractC5087e.m1746extends("Invalid hexadecimal representation of an byte array: [", str, "].").toString());
    }
}
