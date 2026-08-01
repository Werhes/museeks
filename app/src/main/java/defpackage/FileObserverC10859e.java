package defpackage;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC10859e extends FileObserver {
    public final CopyOnWriteArrayList ad;
    public static final Object vip = new Object();
    public static final LinkedHashMap metrica = new LinkedHashMap();

    public FileObserverC10859e(String str) {
        super(str, 128);
        this.ad = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator it = this.ad.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
    }
}
