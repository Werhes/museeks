package defpackage;

import defpackage.C2577e;
import defpackage.InterfaceC6025e;
import io.realm.kotlin.types.RealmInstant$Companion;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6025e extends Comparable {
    public static final RealmInstant$Companion Companion = new Object() { // from class: io.realm.kotlin.types.RealmInstant$Companion
        public static final InterfaceC6025e vip = ad(-999999999, Long.MIN_VALUE);
        public static final InterfaceC6025e metrica = ad(999999999, Long.MAX_VALUE);

        public static InterfaceC6025e ad(int i, long j) {
            if ((j > 0 && i < 0) || (j < 0 && i > 0)) {
                throw new IllegalArgumentException("Arguments must be both positive or negative.");
            }
            long j2 = i / 1000000000;
            long j3 = j + j2;
            return ((j ^ j3) & (j2 ^ j3)) < 0 ? j < 0 ? vip : metrica : new C2577e(j3, i % 1000000000);
        }
    };
}
