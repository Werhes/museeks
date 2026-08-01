package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyTDAT;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۠ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0617e implements InterfaceC16681e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinkedHashSet f2825e = new LinkedHashSet();

    @Override // defpackage.InterfaceC3589e
    public final boolean Signature() {
        return true;
    }

    public final void ad(AbstractC1550e abstractC1550e) {
        this.f2825e.add(abstractC1550e);
    }

    @Override // defpackage.InterfaceC3589e
    public final String getId() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f2825e.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC1550e) it.next()).f4425e);
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC3589e
    public final byte[] purchase() {
        throw new UnsupportedEncodingException();
    }

    @Override // defpackage.InterfaceC16681e
    public final String yandex() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f2825e.iterator();
        sb.append(((AbstractC1550e) it.next()).f28795e.getUserFriendlyValue());
        AbstractC1550e abstractC1550e = (AbstractC1550e) it.next();
        if (abstractC1550e.f28795e.getUserFriendlyValue().length() == 4) {
            sb.append("-");
            sb.append(abstractC1550e.f28795e.getUserFriendlyValue().substring(2, 4));
            if (!((FrameBodyTDAT) abstractC1550e.f28795e).isMonthOnly()) {
                sb.append("-");
                sb.append(abstractC1550e.f28795e.getUserFriendlyValue().substring(0, 2));
            }
        }
        return sb.toString();
    }
}
