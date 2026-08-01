package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C15216e implements InterfaceC1232e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f30114e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30115e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30116e;

    public /* synthetic */ C15216e(Object obj, Object obj2, int i) {
        this.f30116e = i;
        this.f30115e = obj;
        this.f30114e = obj2;
    }

    @Override // defpackage.InterfaceC1232e
    public final void ad() {
        switch (this.f30116e) {
            case 0:
                C12940e c12940e = (C12940e) this.f30115e;
                c12940e.f25793e.removeCallbacks((Runnable) this.f30114e);
                return;
            default:
                String str = (String) this.f30115e;
                C10869e c10869e = (C10869e) this.f30114e;
                synchronized (FileObserverC10859e.vip) {
                    try {
                        LinkedHashMap linkedHashMap = FileObserverC10859e.metrica;
                        FileObserverC10859e fileObserverC10859e = (FileObserverC10859e) linkedHashMap.get(str);
                        if (fileObserverC10859e != null) {
                            fileObserverC10859e.ad.remove(c10869e);
                            if (fileObserverC10859e.ad.isEmpty()) {
                                linkedHashMap.remove(str);
                                fileObserverC10859e.stopWatching();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
