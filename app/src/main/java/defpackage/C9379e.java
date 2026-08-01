package defpackage;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9379e extends C17974e {
    @Override // defpackage.C17974e
    public final C17974e premium() {
        ((AudioAttributes.Builder) this.f35233e).setUsage(1);
        return this;
    }

    @Override // defpackage.C17974e
    public final AudioAttributesImpl smaato() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.f35233e).build(), 0);
    }

    @Override // defpackage.C17974e
    public final C17974e subs() {
        ((AudioAttributes.Builder) this.f35233e).setUsage(1);
        return this;
    }
}
