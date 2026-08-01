package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6391e {
    public final Object ad;
    public final Function0 vip;

    public C6391e(Object obj, Function0 function0) {
        this.ad = obj;
        this.vip = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6391e.class == obj.getClass() && this.ad.equals(((C6391e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
