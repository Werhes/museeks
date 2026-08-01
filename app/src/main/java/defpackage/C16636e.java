package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16636e {
    public static final C16636e metrica = new C16636e(null, null, 63);
    public final Function1 ad;
    public final Function1 vip;

    public C16636e(Function1 function1, Function1 function12, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function12 = (i & 16) != 0 ? null : function12;
        this.ad = function1;
        this.vip = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16636e)) {
            return false;
        }
        C16636e c16636e = (C16636e) obj;
        return this.ad == c16636e.ad && this.vip == c16636e.vip;
    }

    public final int hashCode() {
        Function1 function1 = this.ad;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 923521;
        Function1 function12 = this.vip;
        return (hashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
    }
}
