package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: eّٝٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12617e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C3646e f25338e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25339e;

    public /* synthetic */ C12617e(C3646e c3646e, int i) {
        this.f25339e = i;
        this.f25338e = c3646e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25339e) {
            case 0:
                C3646e c3646e = this.f25338e;
                C12575e c12575e = ((C17241e) c3646e.f8205e.f23950e).advert;
                String str = c3646e.f29618e.ad.ad;
                c12575e.getClass();
                return AbstractC10064e.mopub(new ArrayList());
            case 1:
                this.f25338e.f8203e.getClass();
                return new ArrayList(AbstractC0746e.subscription(C13664e.f27089e, 10));
            default:
                HashMap hashMap = new HashMap();
                C0394e c0394e = this.f25338e.f8202e;
                InterfaceC8614e interfaceC8614e = C3646e.f8199e[0];
                for (Map.Entry entry : ((Map) c0394e.invoke()).entrySet()) {
                    String str2 = (String) entry.getKey();
                    C6798e c6798e = (C6798e) entry.getValue();
                    C1553e metrica = C1553e.metrica(str2);
                    C4813e c4813e = c6798e.vip;
                    EnumC5730e enumC5730e = (EnumC5730e) c4813e.metrica;
                    int ordinal = enumC5730e.ordinal();
                    if (ordinal == 2) {
                        hashMap.put(metrica, metrica);
                    } else if (ordinal == 5) {
                        String str3 = (String) c4813e.yandex;
                        if (enumC5730e != EnumC5730e.MULTIFILE_CLASS_PART) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            hashMap.put(metrica, C1553e.metrica(str3));
                        }
                    }
                }
                return hashMap;
        }
    }
}
