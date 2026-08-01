package defpackage;

import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13160e extends AbstractC7691e {
    public C11859e license;

    @Override // defpackage.AbstractC7691e
    public final void billing(InterfaceC1425e interfaceC1425e, FileChannel fileChannel, String str) {
        this.license.license(interfaceC1425e, fileChannel, str);
    }

    @Override // defpackage.AbstractC7691e
    public final void purchase(FileChannel fileChannel, String str) {
        C11859e c11859e = this.license;
        c11859e.getClass();
        c11859e.license(new C15246e(null, new ArrayList(), false), fileChannel, str);
    }
}
