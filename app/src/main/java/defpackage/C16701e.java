package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16701e {
    public final C8208e ad;
    public final C5033e billing;
    public final Object startapp;
    public final C13065e yandex;
    public final ArrayList vip = new ArrayList();
    public final ArrayList metrica = new ArrayList();
    public final ArrayList license = new ArrayList();
    public final ArrayList appmetrica = new ArrayList();
    public final ArrayList purchase = new ArrayList();

    public C16701e(C5033e c5033e, C13065e c13065e, Object obj, C8208e c8208e) {
        this.ad = c8208e;
        this.billing = c5033e;
        this.yandex = c13065e;
        this.startapp = obj;
    }

    public final C13065e ad() {
        return this.yandex;
    }

    public final void vip(List list, C3079e c3079e, String str, Function2 function2, Function4 function4) {
        list.add(new C10699e(new C17151e(c3079e, this, str, new C2751e(function4, (InterfaceC5083e) null), function2)));
    }
}
