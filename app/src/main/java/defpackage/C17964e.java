package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17964e {
    public final Function1 ad;
    public final InterfaceC3477e license;
    public final C8020e metrica;
    public final C5373e vip;

    public C17964e(Function1 function1, C5373e c5373e, C8020e c8020e, InterfaceC3477e interfaceC3477e) {
        this.ad = function1;
        this.vip = c5373e;
        this.metrica = c8020e;
        this.license = interfaceC3477e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17964e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17964e c17964e = (C17964e) obj;
        if (!AbstractC7890e.billing(this.metrica, c17964e.metrica) || !AbstractC7890e.billing(this.vip, c17964e.vip)) {
            return false;
        }
        c17964e.getClass();
        return true;
    }

    public final int hashCode() {
        return (this.vip.hashCode() + (this.metrica.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.ad + ", graphStateToCameraStateAdapter=" + this.vip + ", sessionConfigAdapter=" + this.metrica + ", sessionProcessor=null, lazyCreationResult=" + this.license + ')';
    }
}
