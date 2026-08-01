package defpackage;

import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18185e extends AbstractC9876e {
    public final AbstractC9876e license;
    public final AbstractC9876e metrica;

    public C18185e(AbstractC9876e abstractC9876e, AbstractC9876e abstractC9876e2) {
        this.metrica = abstractC9876e;
        this.license = abstractC9876e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18185e)) {
            return false;
        }
        C18185e c18185e = (C18185e) obj;
        return this.metrica.equals(c18185e.metrica) && this.license.equals(c18185e.license);
    }

    public final int hashCode() {
        return ((this.license.hashCode() + (this.metrica.hashCode() * 31)) * 31) + 5;
    }

    @Override // defpackage.AbstractC9876e
    public final Shader metrica(long j) {
        Shader metrica = this.metrica.metrica(j);
        Shader metrica2 = this.license.metrica(j);
        return Build.VERSION.SDK_INT >= 29 ? AbstractC7440e.vip(metrica, metrica2, AbstractC14204e.m3771default(5)) : new ComposeShader(metrica, metrica2, AbstractC14204e.m3769catch(5));
    }

    public final String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.metrica + ", srcBrush=" + this.license + ", blendMode=" + ((Object) C8738e.billing(5)) + ')';
    }
}
