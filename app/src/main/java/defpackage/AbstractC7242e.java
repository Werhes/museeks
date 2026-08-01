package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7242e extends AbstractC14697e implements InterfaceC18321e {
    public Matrix adcel;
    public String advert;
    public int mopub;
    public Boolean startapp;
    public List yandex = new ArrayList();

    @Override // defpackage.InterfaceC18321e
    public final void appmetrica(AbstractC16408e abstractC16408e) {
        if (abstractC16408e instanceof C8145e) {
            this.yandex.add(abstractC16408e);
            return;
        }
        throw new SAXException("Gradient elements cannot contain " + abstractC16408e + " elements.");
    }

    @Override // defpackage.InterfaceC18321e
    public final List getChildren() {
        return this.yandex;
    }
}
