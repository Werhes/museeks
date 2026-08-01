package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12190e extends AbstractC1101e {
    public final Object license;
    public final Object metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C12190e(Object obj, Object obj2, int i) {
        this.vip = i;
        this.metrica = obj;
        this.license = obj2;
    }

    @Override // defpackage.AbstractC1101e
    public final C14133e license() {
        switch (this.vip) {
            case 0:
                return (C14133e) ((C12190e) this.metrica).metrica;
            default:
                return (C14133e) this.metrica;
        }
    }

    @Override // defpackage.AbstractC1101e
    public final long metrica() {
        switch (this.vip) {
            case 0:
                return ((File) ((C12190e) this.metrica).license).length();
            default:
                return ((File) this.license).length();
        }
    }

    @Override // defpackage.AbstractC1101e
    public final void mopub(InterfaceC11855e interfaceC11855e) {
        switch (this.vip) {
            case 0:
                C9674e c9674e = new C9674e(new C7063e(interfaceC11855e, new C6846e(28, this)));
                ((C12190e) this.metrica).mopub(c9674e);
                c9674e.flush();
                return;
            default:
                C5476e c5476e = new C5476e(new FileInputStream((File) this.license), C1930e.license);
                try {
                    interfaceC11855e.mo2629class(c5476e);
                    c5476e.close();
                    return;
                } finally {
                }
        }
    }
}
