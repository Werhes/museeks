package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11295e {
    public static final C0922e ad = new C0922e(-1, null, null, 0);
    public static final int vip = AbstractC12547e.yandex(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int metrica = AbstractC12547e.yandex(ModuleDescriptor.MODULE_VERSION, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final C2443e license = new C2443e("BUFFERED", 2);
    public static final C2443e appmetrica = new C2443e("SHOULD_BUFFER", 2);
    public static final C2443e purchase = new C2443e("S_RESUMING_BY_RCV", 2);
    public static final C2443e billing = new C2443e("RESUMING_BY_EB", 2);
    public static final C2443e yandex = new C2443e("POISONED", 2);
    public static final C2443e startapp = new C2443e("DONE_RCV", 2);
    public static final C2443e adcel = new C2443e("INTERRUPTED_SEND", 2);
    public static final C2443e mopub = new C2443e("INTERRUPTED_RCV", 2);
    public static final C2443e advert = new C2443e("CHANNEL_CLOSED", 2);
    public static final C2443e smaato = new C2443e("SUSPEND", 2);
    public static final C2443e amazon = new C2443e("SUSPEND_NO_WAITER", 2);
    public static final C2443e loadAd = new C2443e("FAILED", 2);
    public static final C2443e Signature = new C2443e("NO_RECEIVE_RESULT", 2);
    public static final C2443e admob = new C2443e("CLOSE_HANDLER_CLOSED", 2);
    public static final C2443e subscription = new C2443e("CLOSE_HANDLER_INVOKED", 2);
    public static final C2443e remoteconfig = new C2443e("NO_CLOSE_CAUSE", 2);

    public static final boolean ad(InterfaceC1148e interfaceC1148e, Object obj, Function3 function3) {
        C2443e adcel2 = interfaceC1148e.adcel(obj, function3);
        if (adcel2 == null) {
            return false;
        }
        interfaceC1148e.pro(adcel2);
        return true;
    }
}
