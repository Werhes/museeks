package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15172e extends AbstractC13438e {
    public final /* synthetic */ String adcel;
    public final /* synthetic */ C4094e mopub;
    public final /* synthetic */ C6127e startapp;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C15172e(C6127e c6127e, String str, C4094e c4094e, int i) {
        this.yandex = i;
        this.startapp = c6127e;
        this.adcel = str;
        this.mopub = c4094e;
    }

    public void license() {
        this.startapp.appmetrica(this.adcel);
    }

    @Override // defpackage.AbstractC13438e
    public final void metrica(Object obj) {
        switch (this.yandex) {
            case 0:
                C6127e c6127e = this.startapp;
                LinkedHashMap linkedHashMap = c6127e.vip;
                ArrayList arrayList = c6127e.license;
                String str = this.adcel;
                Object obj2 = linkedHashMap.get(str);
                C4094e c4094e = this.mopub;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c4094e + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    c6127e.vip(intValue, c4094e, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                C6127e c6127e2 = this.startapp;
                ArrayList arrayList2 = c6127e2.license;
                LinkedHashMap linkedHashMap2 = c6127e2.vip;
                String str2 = this.adcel;
                Object obj3 = linkedHashMap2.get(str2);
                C4094e c4094e2 = this.mopub;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c4094e2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    c6127e2.vip(intValue2, c4094e2, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }
}
