package defpackage;

import org.xml.sax.SAXException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2781e extends AbstractC18098e {
    @Override // defpackage.AbstractC18098e, defpackage.InterfaceC18321e
    public final void appmetrica(AbstractC16408e abstractC16408e) {
        if (abstractC16408e instanceof InterfaceC3348e) {
            this.startapp.add(abstractC16408e);
            return;
        }
        throw new SAXException("Text content elements cannot contain " + abstractC16408e + " elements.");
    }
}
