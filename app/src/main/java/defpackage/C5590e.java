package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5590e {
    public final Context ad;
    public final InterfaceC6823e license;
    public final InterfaceC6823e metrica;
    public final InterfaceC6823e vip;
    public volatile int appmetrica = 0;
    public final CopyOnWriteArrayList purchase = new CopyOnWriteArrayList();
    public final Object billing = new Object();
    public volatile AbstractC16326e yandex = null;

    public C5590e(Context context, InterfaceC6823e interfaceC6823e, InterfaceC6823e interfaceC6823e2, InterfaceC6823e interfaceC6823e3) {
        this.ad = context;
        this.vip = interfaceC6823e;
        this.metrica = interfaceC6823e2;
        this.license = interfaceC6823e3;
    }
}
