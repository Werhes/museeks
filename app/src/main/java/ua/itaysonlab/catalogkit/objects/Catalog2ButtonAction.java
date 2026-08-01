package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u000e\n\t\u0006\u0017\u000f\u0010\u0018\u000b\b\r\f\u0007\u0014\u0019\u0012\u0011\u0013\u0016¨\u0006\u001a"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", BuildConfig.FLAVOR, "<init>", "()V", "OpenUrl", "PlayVkMix", "eٖۜؗ", "eٍَؖ", "eِِۤ", "eؕٞۤ", "eٍؘُ", "eٍٜۨ", "eؘٞۚ", "eؗۦۨ", "eٍؖۦ", "eٌٛٓ", "eؗؑۤ", "eؒؑۦ", "eؘؖٗ", "eؒۦؕ", "eٖؓٞ", "SynthCustomAction", "eٟٗ", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$OpenUrl;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$PlayVkMix;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$SynthCustomAction;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Catalog2ButtonAction {

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$OpenUrl;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class OpenUrl extends Catalog2ButtonAction {
        public final String ad;

        public OpenUrl(String str) {
            super(0);
            this.ad = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && AbstractC7890e.billing(this.ad, ((OpenUrl) obj).ad);
        }

        public final int hashCode() {
            return this.ad.hashCode();
        }

        public final String toString() {
            return AbstractC4653e.applovin(new StringBuilder("OpenUrl(url="), this.ad, ')');
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$PlayVkMix;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class PlayVkMix extends Catalog2ButtonAction {
        public final String ad;

        public PlayVkMix(String str) {
            super(0);
            this.ad = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlayVkMix) && AbstractC7890e.billing(this.ad, ((PlayVkMix) obj).ad);
        }

        public final int hashCode() {
            return this.ad.hashCode();
        }

        public final String toString() {
            return AbstractC4653e.applovin(new StringBuilder("PlayVkMix(style="), this.ad, ')');
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$SynthCustomAction;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SynthCustomAction extends Catalog2ButtonAction {
        public final String ad;
        public final transient Function1 license;
        public final int metrica;
        public final String vip;

        public SynthCustomAction(String str, String str2, int i, Function1 function1) {
            super(0);
            this.ad = str;
            this.vip = str2;
            this.metrica = i;
            this.license = function1;
        }
    }

    private Catalog2ButtonAction() {
    }

    public /* synthetic */ Catalog2ButtonAction(int i) {
        this();
    }
}
