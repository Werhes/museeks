package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6689e {
    public static final String metrica;
    public static final C6689e vip = new C6689e(new HashSet());
    public final AbstractC12614e ad;

    static {
        String str = AbstractC9413e.ad;
        metrica = Integer.toString(0, 36);
    }

    public C6689e(HashSet hashSet) {
        this.ad = AbstractC12614e.admob(hashSet);
    }

    public static C6689e vip(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(metrica);
        if (parcelableArrayList == null) {
            AbstractC2803e.smaato("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return vip;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(C11858e.ad((Bundle) parcelableArrayList.get(i)));
        }
        return new C6689e(hashSet);
    }

    public final boolean ad(int i) {
        AbstractC2301e.yandex(i != 0, "Use contains(Command) for custom command");
        Iterator<E> it = this.ad.iterator();
        while (it.hasNext()) {
            if (((C11858e) it.next()).ad == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6689e) {
            return this.ad.equals(((C6689e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.ad);
    }
}
