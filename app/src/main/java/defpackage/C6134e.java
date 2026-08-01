package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6134e implements InterfaceC12353e {
    public final /* synthetic */ String[] vip;

    public C6134e(String[] strArr) {
        this.vip = strArr;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return InterfaceC12353e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC12353e) {
            return Arrays.equals(this.vip, ((C6134e) ((InterfaceC12353e) obj)).vip);
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Arrays.hashCode(this.vip) ^ 397397176;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return AbstractC5087e.m1746extends("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.vip), ")");
    }
}
