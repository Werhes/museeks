package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18301e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35955e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Serializable f35956e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f35957e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f35958e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18301e(LinkedHashSet linkedHashSet, boolean z, C12810e c12810e, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f35956e = linkedHashSet;
        this.f35958e = z;
        this.f35957e = c12810e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18301e(boolean z, C8221e c8221e, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f35958e = z;
        this.f35957e = c8221e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f35955e) {
            case 0:
                return ((C18301e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C18301e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (((defpackage.C18479e) r1).appmetrica.length() <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (r1.compareTo(((defpackage.C18479e) r3).metrica) < 0) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0060  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18301e.loadAd(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f35955e) {
            case 0:
                return new C18301e((LinkedHashSet) this.f35956e, this.f35958e, (C12810e) this.f35957e, interfaceC5083e);
            default:
                return new C18301e(this.f35958e, (C8221e) this.f35957e, interfaceC5083e);
        }
    }
}
