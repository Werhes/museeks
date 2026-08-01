package defpackage;

import java.io.File;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17067e extends AbstractC3184e {
    public int vip;

    @Override // defpackage.AbstractC3184e
    public final String ad() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // defpackage.AbstractC3184e
    public final String appmetrica() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof C17067e;
    }

    public final int hashCode() {
        int i = this.vip;
        if (i != 0) {
            return i;
        }
        this.vip = -1391114360;
        return -1391114360;
    }

    @Override // defpackage.AbstractC3184e
    public final String license() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.AbstractC3184e
    public final int metrica() {
        return 44;
    }

    @Override // defpackage.AbstractC3184e
    public final String vip() {
        return "logInternal";
    }
}
