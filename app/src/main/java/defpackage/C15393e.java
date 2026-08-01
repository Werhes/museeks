package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15393e extends AbstractC5427e {
    @Override // defpackage.AbstractC15440e
    public final int appmetrica(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // defpackage.AbstractC15440e
    public final long billing(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.AbstractC5427e
    public final Random startapp() {
        return ThreadLocalRandom.current();
    }

    @Override // defpackage.AbstractC15440e
    public final long yandex() {
        return ThreadLocalRandom.current().nextLong(1000L);
    }
}
