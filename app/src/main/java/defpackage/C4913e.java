package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4913e implements InterfaceC7048e {
    public final InterfaceC13021e ad;
    public final Function0 metrica;
    public final Function1 vip;
    public static final LinkedHashSet license = new LinkedHashSet();
    public static final Object appmetrica = new Object();

    public /* synthetic */ C4913e(InterfaceC13021e interfaceC13021e, Function0 function0) {
        this(interfaceC13021e, new C2163e(22), function0);
    }

    public C4913e(InterfaceC13021e interfaceC13021e, Function1 function1, Function0 function0) {
        this.ad = interfaceC13021e;
        this.vip = function1;
        this.metrica = function0;
    }

    @Override // defpackage.InterfaceC7048e
    public final InterfaceC2885e ad() {
        File canonicalFile = ((File) this.metrica.invoke()).getCanonicalFile();
        synchronized (appmetrica) {
            String absolutePath = canonicalFile.getAbsolutePath();
            LinkedHashSet linkedHashSet = license;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            linkedHashSet.add(absolutePath);
        }
        return new C12099e(canonicalFile, this.ad, (InterfaceC4417e) this.vip.invoke(canonicalFile), new C10479e(27, canonicalFile));
    }
}
