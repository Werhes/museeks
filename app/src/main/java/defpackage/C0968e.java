package defpackage;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0968e {
    public final C0520e ad;
    public final InterfaceC16897e[] appmetrica;
    public final Function1 license;
    public final Collection metrica;
    public final C10445e vip;

    public C0968e(C0520e c0520e, C10445e c10445e, Collection collection, Function1 function1, InterfaceC16897e... interfaceC16897eArr) {
        this.ad = c0520e;
        this.vip = c10445e;
        this.metrica = collection;
        this.license = function1;
        this.appmetrica = interfaceC16897eArr;
    }

    public /* synthetic */ C0968e(C0520e c0520e, InterfaceC16897e[] interfaceC16897eArr) {
        this(c0520e, interfaceC16897eArr, C11633e.f23366e);
    }

    public C0968e(C0520e c0520e, InterfaceC16897e[] interfaceC16897eArr, Function1 function1) {
        this(c0520e, null, null, function1, (InterfaceC16897e[]) Arrays.copyOf(interfaceC16897eArr, interfaceC16897eArr.length));
    }

    public /* synthetic */ C0968e(Collection collection, InterfaceC16897e[] interfaceC16897eArr) {
        this(collection, interfaceC16897eArr, C11633e.f23365e);
    }

    public C0968e(Collection collection, InterfaceC16897e[] interfaceC16897eArr, Function1 function1) {
        this(null, null, collection, function1, (InterfaceC16897e[]) Arrays.copyOf(interfaceC16897eArr, interfaceC16897eArr.length));
    }
}
